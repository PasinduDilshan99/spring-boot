package com.example.secondapp.common;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Lazy
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach{

    public BaseballCoach(){
        System.out.println("constructor run : " + getClass().getSimpleName());
    }

//    // define our init method
//    @PostConstruct
//    public void doMyPost(){
//        System.out.println("doMypost : "+ getClass().getSimpleName());
//    }
//
//    // define our destroy method
//    @PostConstruct
//    public void doMyDestroy(){
//        System.out.println("doMyDestroy : "+ getClass().getSimpleName());
//    }

    @Override
    public String getDailyWorkout() {

        return "Baseball Match";
    }
}
