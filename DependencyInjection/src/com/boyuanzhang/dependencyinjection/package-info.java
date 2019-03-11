/**
 * https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial
 * ************************************************************************************
 * JAVA DEPENDENCY INJECTION
 * ************************************************************************************
 * Java Dependency Injection design pattern allows us to remove 
 * the hard-coded dependencies and make our application loosely coupled, 
 * extendable and maintainable. We can implement dependency injection 
 * in java to move the dependency resolution from compile-time to runtime.
 * ************************************************************************************
 * EmailService ***********************************************************************
 * Let’s say we have an application where we consume EmailService to send 
 * e-mails. 
 * ************************************************************************************
 * EmailService ***********************************************************************
 * EmailService class holds the logic to send email message to the recipient 
 * email address.
 * ************************************************************************************
 * MyApplication **********************************************************************
 * Our client code that will use MyApplication class to send email messages 
 * ************************************************************************************
 * At first look, there seems nothing wrong with above implementation.
 * But the code logic has certain limitations.
 * ************************************************************************************
 * MyApplication **********************************************************************
 * - 	MyApplication class is responsible to initialize the email service and 
 * 		then use it. This leads to hard-coded dependency. 
 * 		If we want to switch to some other advanced email service in future, 
 * 		it will require code changes in MyApplication class. 
 * 		This makes our application hard to extend and if email service is used 
 * 		in multiple classes then that would be even more harder.
 * 
 * - 	If we want to extend our application to provide additional messaging 
 * 		feature, such as SMS or Facebook message then we would need to write 
 * 		another application for that. This will involve code changes in 
 * 		application classes and in client classes too.
 * 
 * - 	Testing the application will be very difficult since our application 
 * 		is directly creating the email service instance. 
 * 		There is no way we can mock these objects in our test classes.
 * ************************************************************************************
 * MyApplication1 *********************************************************************
 * One can argue that we can remove the email service instance creation 
 * from MyApplication1 class by having a constructor that requires email 
 * service as argument.
 * ************************************************************************************
 * But in this case, we are asking client applications or test classes
 * to initializing the email service that is not a good design decision. 
 * ************************************************************************************
 * Now let’s see how we can apply java dependency injection pattern 
 * to solve all the problems with above implementation. Dependency Injection 
 * in java requires at least following:
 * 1 -	Service components should be designed with base class or interface. 
 * 		It’s better to prefer interfaces or abstract classes that would define 
 * 		contract for the services.
 * 2 -	Consumer classes should be written in terms of service interface.
 * 3 -	Injector classes that will initialize the services and then the consumer 
 * 		classes.
 * ************************************************************************************
 * JAVA DEPENDENCY INJECTION - SERVICE COMPONENTS
 * ************************************************************************************
 * MessageService *********************************************************************
 * For our case, we can have MessageService that will declare the contract
 * for service implementations.
 * ************************************************************************************
 * EmailServiceImpl - SMSServiceImpl **************************************************
 * Now let’s say we have Email and SMS services that implement above interfaces.
 * Our dependency injection java services are ready and now we can write our consumer 
 * class.
 * ************************************************************************************
 * JAVA DEPENDENCY INJECTION - SERVICE CONSUMER
 * ************************************************************************************ 
 * Consumer - MyDIApplication *********************************************************
 * We are not required to have base interfaces for consumer classes but I will have 
 * a Consumer interface declaring contract for consumer classes.
 * ************************************************************************************
 * Notice that our application class is just using the service. It does not initialize 
 * the service that leads to better “separation of concerns“. Also use of service 
 * interface allows us to easily test the application by mocking the MessageService 
 * and bind the services at runtime rather than compile time.
 * ************************************************************************************ 
 * Now we are ready to write JAVA DEPENDENCY INJECTOR CLASSES that will initialize 
 * the service and also consumer classes.
 * ************************************************************************************
 * JAVA DEPENDENCY INJECTION - INJECTOR CLASSES
 * ************************************************************************************
 * MessageServiceInjector *************************************************************
 * Let’s have an interface MessageServiceInjector with method declaration that returns 
 * the Consumer class.
 * ************************************************************************************
 * EmailServiceInjector ***************************************************************
 * Now for every service, we will have to create injector classes like 
 * EmailServiceInjector and SMSServiceInjector
 * ************************************************************************************
 * MyMessageDITest ********************************************************************
 * Now let’s see how our client applications will use the application with a simple 
 * program.
 * ************************************************************************************ 
 * As you can see that our application classes are responsible only for using the 
 * service. Service classes are created in injectors. Also if we have to further 
 * extend our application to allow facebook messaging, we will have to write Service
 * classes and injector classes only.
 * ************************************************************************************
 * So dependency injection implementation solved the problem with hard-coded 
 * dependency and helped us in making our application flexible and easy to extend.
 * Now let’s see how easily we can test our application class by mocking the injector 
 * and service classes.
 * ************************************************************************************
 * JAVA DEPENDENCY INJECTION - JUNIT TEST CASE WITH MOCK INJECTOR AND SERVICE
 * ************************************************************************************ 
 * 
 * 
 */
/**
 * @author Boyuan Zhang
 *
 */
package com.boyuanzhang.dependencyinjection;