## Example of Spring Boot with multiple databases/datasources.


[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://travis-ci.org/joemccann/dillinger)

This is an example of spring boot with multiple datasources.

- There are two API's available for two datasources(policy and product)
-  Seperate configuration provided in *application-dev.yaml*
-  Please change datasource url, username, password for both.
- ✨Magic ✨

## Features

http://localhost:8086/product/saveproduct
##### RequestBody: 
{
    "productId": 1425,
    "productName":"Syneosys",
    "productDesc":"Health Policy"
}
---
http://localhost:8086/policy/savepolicy
##### RequestBody: 
{
    "policyId": 1425,
    "policyType":"Inactive",
    "createdAt":"2018-02-05T12:59:11.332"
}
---
> Thanks from  
> #### Arpan


.


