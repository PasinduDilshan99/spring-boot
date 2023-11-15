package com.example.secondapp.rest;

import com.example.secondapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
//    private Coach anotherCoach;

//    @Autowired
//    public DemoController(@Qualifier("baseballCoach") Coach theCoach,
//                          @Qualifier("baseballCoach") Coach theAnotherCoach){
//        System.out.println("constructor run : " + getClass().getSimpleName());
//        myCoach = theCoach;
//        anotherCoach = theAnotherCoach;
//    }
//    @Autowired
//    public DemoController(@Qualifier("baseballCoach") Coach theCoach){
//        System.out.println("constructor run : " + getClass().getSimpleName());
//        myCoach = theCoach;
//
//    }

//    @Autowired
//    public DemoController(Coach theCoach){
//        myCoach = theCoach;
//    }

//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }

    @Autowired
    public DemoController(@Qualifier("swimCoach") Coach theCoach){
        System.out.println("constructor run : " + getClass().getSimpleName());
        myCoach = theCoach;

    }


    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/check")
//    public String check(){
//        return "comparing beans : my coach == anotherCoach  :  " + (myCoach == anotherCoach);
//    }

}
