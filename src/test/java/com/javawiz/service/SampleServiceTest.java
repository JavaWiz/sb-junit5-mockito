package com.javawiz.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class SampleServiceTest {

    @Autowired
    private SampleService service;

    @DisplayName("Test Spring @Autowired Integration")
    @Test
    void testGet() {
        assertEquals("Hello JUnit 5", service.get());
    }

}