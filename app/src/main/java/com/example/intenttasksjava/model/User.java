package com.example.intenttasksjava.model;

import java.io.Serializable;

public class User implements Serializable {
    String name;
    String age;
    public User(String name, String age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
