# Spring Container
* **Primary functions of the Spring container are**:
  * Create and manage objects *(Inversion of Control)*
  * Inject object's dependencies *(Dependency Injection)*

## Inversion of Control
### Configuring Spring Container: 
There are three ways to configure a Spring container:
* XML configuration file (legacy, but widely used in old apps)
* Java Annotations (modern)
* Java Source Code (modern)

#### Spring Development Process
1. Configure the Spring Beans (e.g., XML configuration file)
2. Create the Spring Container
   * Spring container is generically known as **ApplicationContext**
   * Specialized implementations
     * ClassPathXmlApplicationContext
     * AnnotationConfigApplicationContext
     * GenericWebApplicationContext
     * Other implementations....
3. Retrieve Beans from the Spring Container

##### What is a Spring Bean?
Spring Bean is simply a Java object. When Java objects are created by the Spring container, 
then Spring refers to them as "Spring Beans". Spring Beans are created from normal Java classes, 
just like Java objects.
#### Why do we specify the Coach interface in getBean()?
When we pass the interface to the method, behind the scenes Spring will cast the object for you. 


## Dependency Injection
The dependency inversion principle: 
"The client delegates to another object the responsibility of providing its dependencies".

### Injection Types
There are several injection types with Spring, but in this course only the two most common ones are covered:
1. Constructor Injection
2. Setter Injection

#### Constructor Injection - Dev Process
1. Define the dependency interface and class which implements the interface
    * interface FortuneService
    * class HappyFortuneService
2. Create a constructor in your class for injections
   * create a constructor in the BaseballCoach class which accept the dependency 'FortuneService'
   * This is where we are injecting the dependency
3. Configure the dependency injection in Spring config file
   * create a new bean configuration for the new dependency
   * update the myCoach bean with 'constructor-arg' to inject the new dependency.

