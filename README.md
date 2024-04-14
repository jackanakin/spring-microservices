> https://www.udemy.com/course/spring-boot-microservices-and-spring-cloud

## discovery -> Eureka Discovery Server
> Eureka discovery server, responsible for registering all microservices available.
> Each instance of a microservice will automatically manage it's reigstration with Eureka, thus making addresses available for API Gateway balancing.

Products Service 1 -> http://localhost:3001 -->
Products Service 2 -> http://localhost:3002 --> Eureka
Products Service 3 -> http://localhost:3003 -->

### Steps
1. Add @EnableEurekaServer to the Application
2. Add to application.properties

## api.users -> Microservice 1
> Users microservice
> Sample api for testing Eureka server

### Steps
1. Add @EnableDiscoveryClient to the Application
2. Add to application.properties

## api.account -> Microservice 2
> Account management microservice
> Sample api for testing Eureka server

### Steps
1. Add @EnableDiscoveryClient to the Application
2. Add to application.properties

## apigateway -> Spring Cloud API Gateway
> Allows to automatically discover routes based on services registered with a service registry like Eureka

> Attention to the wrong package! --> spring-cloud-starter-gateway-mvc <--

### Steps
1. Add to application.properties
2. Use eureka.instance.instance-id in services properties to distinct multiple instances
3. Open http://localhost:8082/my-custom/users/check multiple times and check the port number change.

### Usage
> Is case sensitive
> http://localhost:8082/users-api/users/status/check
> http://localhost:8082/management-api/account/status/check

> https://cloud.spring.io/spring-cloud-gateway/reference/html/#gateway-request-predicates-factories
> https://cloud.spring.io/spring-cloud-gateway/reference/html/#gatewayfilter-factories
> https://cloud.spring.io/spring-cloud-gateway/reference/html/#global-filters
> https://cloud.spring.io/spring-cloud-gateway/reference/html/#httpheadersfilters