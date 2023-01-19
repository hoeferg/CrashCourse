package com.example.crashcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrashCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrashCourseApplication.class, args);
    }
    //variables
    String firstName = "Anna";

    //types
        //primitive types
        char aLetter = 'a'; // a single charater in single quotes
        boolean isLoggedIn = false;
        int aWholeNum = 42;
        double aDecimalPointNum = 42.42424;

        //non-primitive types
//       // object types must use capital letter
    String aNewName = "Bob";
    Double aNewNum = 54.56;
    Integer aNewWholeNum = 90;
    Boolean isLoggedOut = true;

    Double anotherNum = (double) aNewWholeNum;
    //privacy


}
