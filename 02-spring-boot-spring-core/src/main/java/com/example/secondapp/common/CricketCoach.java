package com.example.secondapp.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("constructor run : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout(){
        return "Cricket Match";
    }

}
