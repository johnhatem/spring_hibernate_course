package com.example.p1_coach;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args){

        // load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve a bean from the spring container
        Coach theCoach = context.getBean("myCoach", Coach.class); //See Notes for Why do we specify the Coach interface here

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());

        // call Fortune methods
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
