# First stage: Build the jar file
FROM maven:3.8.5-openjdk-11 as builder

# Create Working Directory
RUN mkdir -p /home/csrp/docker/api-gateway

# Set Working Directory
WORKDIR /home/csrp/docker/api-gateway

# Copy all file & directory in git repository to docker image
COPY . .

# Use prod/dev config for jar building
RUN cp ./src/main/resources/application-<branch>.yml ./src/main/resources/application.yml

# Maven build image
RUN mvn install -Dmaven.test.skip

# Second stage: Copy the jar file & run the jar file
FROM debian:stretch-slim

# Set Java Args
ARG APP_OPTIONS="-Xms1024M -Xmx2048M"

# Set OS Environment
ENV APP_OPTIONS=${APP_OPTIONS}\
    JAVA_HOME=/usr/local/openjdk-11\
    PATH="$PATH:$JAVA_HOME/bin"\
    TZ=Asia/Jakarta

# Copy jar from builder stage
COPY --from=builder "$JAVA_HOME" "$JAVA_HOME" /home/csrp/docker/api-gateway/api-gateway.jar ./

# apt update & install ssh server
RUN apt-get update && apt-get install -y procps openssh-server && rm -rf /var/lib/apt/lists/*

# set timezone
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

# expose port
EXPOSE 8760

# run jar with args APP_OPTIONS
CMD ["sh", "-c", "java $APP_OPTIONS -jar /api-gateway.jar"]