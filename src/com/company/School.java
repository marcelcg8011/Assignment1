package com.company;

public class School {
    private String FullName;

    public School(String fullName) {
        FullName = fullName;
    }
    School()
    {

    }
    public void printFullName()
    {
        System.out.println("-------------- Task 1 --------------");
        System.out.println("School Full Name: " + FullName);
    }



    public void setFullName(String fullName) {
        FullName = fullName;
    }
}
