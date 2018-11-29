# microservices-eureka-spring
A micorservice experiment with Spring, Eureka, Zuul, and JJWT

Following the approach in three posts:
1. https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-intro-to-microservices-part-1-c0d24cd422c3
2. https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-creating-our-microserivces-gateway-part-2-31f8aa6b215b
3. https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-authentication-with-jwt-part-3-fafc9d7187e8

## To run experiment.
1. Build all 5 projects using mvn package
2. Run each project on a unique port
3. Start multiple instances of imageservice, galleryservice, and authservice using different ports.
4. Send requests as documented in "Testing Our Microservices" - https://medium.com/omarelgabrys-blog/microservices-with-spring-boot-authentication-with-jwt-part-3-fafc9d7187e8
