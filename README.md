Api Gateway for PDF Creator


 clone at http://billing.swamedia.co.id/csrp-asdp/backend/api-gateway.git
 
 rules:
 - daftarkan di discovery service
 - add config di application.yml:
```
zuul:
  ignored-services: '*'
  routes:
    users:
      path: /users/**
      serviceId: user-service
```

- contoh diatas untuk mendaftarkan user service pada pada gateway, sehingga untuk akses nya menjadi:
  "http://ip-address-api-gateway:port-ip-gateway/users/"
  setiap endpoint yang mengarah ke /users/** akan di redirect ke user service.
