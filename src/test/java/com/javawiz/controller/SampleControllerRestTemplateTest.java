package com.javawiz.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import java.net.URL;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SampleControllerRestTemplateTest {

    @LocalServerPort
    private int port;

    private String url;

    @Autowired
    private TestRestTemplate restTemplate;

    @BeforeEach
    public void setUp() {
        url = String.format("http://localhost:%d/", port);
    }

    @Test
    public void greetingShouldReturnDefaultMessage() {
        assertThat(this.restTemplate.getForObject(url, String.class)).contains("Hello JUnit 5");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = restTemplate.getForEntity(
                new URL("http://localhost:" + port + "/").toString(), String.class);
        assertEquals("Hello JUnit 5", response.getBody());
    }
}