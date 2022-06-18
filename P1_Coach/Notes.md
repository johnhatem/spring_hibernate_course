## Spring Container
* **Primary functions of the Spring container are**:
  * Create and manage objects *(Inversion of Control)*
  * Inject object's dependencies *(Dependency Injection)*

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
