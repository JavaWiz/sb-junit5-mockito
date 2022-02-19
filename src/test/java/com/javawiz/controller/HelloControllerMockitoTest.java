package com.javawiz.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import com.javawiz.service.SampleService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HelloControllerMockitoTest {

    @Mock
    private SampleService sampleService;

    @InjectMocks
    private MainController mainController;

    @BeforeEach
    void setMockOutput() {
        when(sampleService.get()).thenReturn("Hello Mockito Test");
    }

    @Test
    public void shouldReturnDefaultMessage() {
        String response = mainController.hello();
        assertThat(response).isEqualTo("Hello Mockito Test");
    }
}