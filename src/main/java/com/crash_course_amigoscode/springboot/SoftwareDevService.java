package com.crash_course_amigoscode.springboot;

import org.springframework.stereotype.Service;

import java.util.List;

@Service //makes it available as a Bean
public class SoftwareDevService {
    private final SoftwareDevRepository softwareDevRepository;

    public SoftwareDevService(SoftwareDevRepository softwareDevRepository) {
        this.softwareDevRepository = softwareDevRepository;
    }

    public List<SoftwareDevEntity> fetchDevData() {
        return softwareDevRepository.findAll();
    }
}
