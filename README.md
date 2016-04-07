# Spring-Swagger-Global-Exceptionhandlers
This project implements Swagger UI with Spring frame work and handles Global Exception Controllers

Advantages of Swagger UI
------------
1) Swagger plugin helps in creating API documentation . Here from the URI definition, Swagger Spec can be generated and used in Swagger UI by development team to maintain API documentation.
  
2) Swagger definition can be used here if Development team is using Swagger for maintaining the API documentation and provides testing team the same."
3) once you have a swagger definition, it's faster to create test cases inside SoapUI and Ready! tools.  You'll know all the paths, parameters, and expected payloads from the API.


Exception Handling
----
Spring MVC provides several complimentary approaches to exception handling

Global Exception Handling
-----------------------
A controller advice allows you to use exactly the same exception handling techniques but apply them
across the whole application, not just to an individual controller. You can think of them as an annotation
driven interceptor.

Any class annotated with @ControllerAdvice becomes a controller-advice and below is below are the types it supports:

Exception handling methods annotated with @ExceptionHandler,@InitBinder and @ModelAttribute.

@ControllerAdvice annotation is a specialization of @Component. The classes annotated with @ControllerAdvice are auto detected by classpath scanning. The use of @ControllerAdvice is advising all or selected controllers for @ExceptionHandler,@InitBinder and @ModelAttribute

What we have to do is create a class annotated with @ControllerAdvice and create required method which will be annotated with @ExceptionHandler for global exception handling, @InitBinder for global init binding and @ModelAttribute for global model attributes addition

Whenever a request comes to controller and its method with @RequestMapping and if there is no locally defined @ExceptionHandler, @InitBinder and @ModelAttribute, the globally defined class annotated with @ControllerAdvice is served. 
