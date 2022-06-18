package com.example.p1_coach;

public class BaseballCoach implements Coach {

    // Define a private field for the dependency
    private FortuneService fortuneService;

    // Define a constructor for the dependency injection
    public BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes on baseball practice";
    }

    @Override
    public String getDailyFortune() {
        // use my fortuneService to get a fortune
        // i.e., make use of the helper class (coach delegates to the helper class) to get a fortune
        return fortuneService.getFortune();
    }
}
