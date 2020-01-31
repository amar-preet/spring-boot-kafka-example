package com.example.kafka.springbootkafkademo.model;

public class User {

    public User(String name, String major) {
        this.name = name;
        this.major = major;
    }

    private String name;
    private String major;

    public void setName(String name) {
        this.name = name;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
}

