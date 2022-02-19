package com.javawiz.service;

import com.javawiz.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SampleServiceImpl implements SampleService {

    private SampleRepository sampleRepository;

    @Autowired
    public SampleServiceImpl(SampleRepository sampleRepository){
        this.sampleRepository = sampleRepository;
    }

    @Override
    public String get() {
        return sampleRepository.get();
    }
}