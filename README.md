# rest-client-feign

Example of Rest client spring netflix feign to use two service from eureke server 
( BOOT-COMMAND-SERVICE and BOOT-CUSTOMER-SERVICE)

To run the project :

1. Get the two project (microservice-example and spring-boot-mongodb ) from https://github.com/MBAGIT
 mvn clean install 

2. The eureka server (eureka-server-app ) from https://github.com/MBAGIT and deploy it :
mvn spring-boot:run

3. Register the two service to eureka :
 mvn spring-boot:run  from the first service microservice-example
 mvn spring-boot:run  from the seconde service microservice-example
 
4. check the url (localhost:8761) and run the example commandLine .


 
 





