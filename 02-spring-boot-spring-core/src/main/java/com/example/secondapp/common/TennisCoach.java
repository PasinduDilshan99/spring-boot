package com.example.secondapp.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class TennisCoach implements Coach{
    public TennisCoach() {
        System.out.println("constructor run : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Tennis Match";
    }
}
