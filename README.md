Selenium Vaadin integration
===========================

Template Maven project for using  [Selenium](http://www.seleniumhq.org/) 
integration testing in [Vaadin](https://vaadin.com/home) framework.

Modules
-------
 - `selenium-test` contains Selenium dummy tests for testing maven 
 configuration.
 - `vaadin-sample` contains minimal Vaadin application with some common
 components for testing and unit/IT tests for it.
 
Usage
-----

Run `mvn clean verify` to use only unit tests.

Run `mvn clean verify -P IT` to use unit tests and integration tests.

In this profile before launching ITs will start 
[jetty](https://mvnrepository.com/artifact/org.eclipse.jetty) plugin and 
will stop after execution.

**Note** that all integration test classes need contain `IT` in beginning
or ending of name (for example `IT_Test` or `TestIT`). Otherwise Maven 
will think than its are unit tests will execute them before building 
application. 