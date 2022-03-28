package com.practica.ibm.spring.test;


public class Test {
    // naming conventions
    // package name -> small letters
    // class name -> Capital letters, then camel case
    // attribute names -> first letter small letter, followed by camel case
    private String firstNameFromTheMotherSide;

    // boolean type
    private boolean employed; // true || false
    // boolean getter
    public boolean isEmployed(){
        return employed;
    }

    // static fields -> all caps, words separated by underscore
    public final static String PHOTO_ID_OF_OWNER = "BV01329491";
}
