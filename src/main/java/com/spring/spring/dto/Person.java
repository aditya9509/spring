package com.spring.spring.dto;

import org.springframework.stereotype.Component;

@Component
public class Person {
    private String firstName;

    private String lastName;


    public Person(){
        this.firstName = "Aditya";
        this.lastName = "Naidu";
    }

    @Override
    public String toString(){
        return "My name is: " + this.firstName + " " + this.lastName;
    }
}
