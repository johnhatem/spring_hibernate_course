package com.example.p1_coach;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 10K";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune() + " Just Do It!";
    }
}
