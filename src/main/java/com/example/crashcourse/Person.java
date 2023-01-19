package com.example.crashcourse;

public class Person {
    public String firstName;
    public String lastName;
    private String middleName;
    private int userID;

    public String getFullName() {
        return firstName + middleName + lastName;
    }

    public static String sayHi() {
        return "Hi!";
    }

    //constructor
}
