package com.javawiz.repository;

@org.springframework.stereotype.Repository
public class SampleRepository implements Repository {
    @Override
    public String get() {
        return "Hello JUnit 5";
    }
}
