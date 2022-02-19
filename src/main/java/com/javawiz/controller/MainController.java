package com.javawiz.controller;

import com.javawiz.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    private final SampleService sampleService;

    @Autowired
    public MainController(SampleService sampleService){
        this.sampleService = sampleService;
    }

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return sampleService.get();
    }
}