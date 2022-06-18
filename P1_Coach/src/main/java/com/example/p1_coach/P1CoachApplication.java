/***
 * Application requirements:
 * 1- Easily change the coach to another sport
 * 2- App should be configurable (Inversion of Control)
 */
package com.example.p1_coach;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P1CoachApplication {

    public static void main(String[] args) {
//        SpringApplication.run(P1CoachApplication.class, args);

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());

    }

}
