package com.example.secondapp.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach{
    public TrackCoach() {
        System.out.println("constructor run : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Track Event";
    }
}
