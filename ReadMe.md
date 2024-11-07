### override security configuration

### OpenAPI Documentation

#### Spring Boot 3 support OpenAPI 2.0+ specification. See dependency in pom.xml for detail.

#### OpenAPI2.0+ supports annotation based configuration, no need to override configuration in Java. Important Annotations -

##### servers inside OpenAPIDefinition annotation is used for configuring multiple servers for swagger documentation. This is an important annotation because using 2 different servers, we can request APIs.

##### security inside OpenAPIDefinition annotation is used for configuring security schemas at global level (for all the controllers). To apply at seperate controllers we use @SecurityRequirement annotation.

##### @SecurityScheme annotation is used to configure authorization header for APIs.

##### Only defining @SecurityScheme will not pass AUthorization header in APIs, we will need @SecurityRequirement in controller with the name that we have defined in @SecurityScheme annotation.

##### @Tag - Used to change the name of the controller in swagger document.

##### @Operation - Used to change the name of the API in swagger documentation.
