package com.example.crashcourse;

public class Person {
    public String firstName;
    public String lastName;
    public String middleName;
    private int userID;

    public String getFullName() {
        return firstName + middleName + lastName;
    }

    public static String sayHi() {
        return "Hi!";
    }

    public Person(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
//constructor

    @Override
    public String toString() {
        return "This person's name is " + this.firstName + " " +this.lastName + ".";
    }

    public Person(String firstName) {
        this.firstName = firstName;

        //ToString

    }
}
