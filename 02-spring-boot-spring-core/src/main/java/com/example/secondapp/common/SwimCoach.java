package com.example.secondapp.common;

public class SwimCoach implements Coach{

    public SwimCoach(){
        System.out.println("In constrouctor : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swim Tounerment";
    }
}
