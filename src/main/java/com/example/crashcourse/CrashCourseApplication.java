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
    public String lastName = "Hoefer";
//        Can assess within and without the scope of the method
    private String middleName = "E";
//    Can assess only within the scope of the method

    //final

    private final String DOB = "01.01.2001";
    public final String firstPetsName = "Bob";

//    funct

}
