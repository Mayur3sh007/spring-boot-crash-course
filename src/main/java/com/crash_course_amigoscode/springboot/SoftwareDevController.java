package com.crash_course_amigoscode.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-devs")
public class SoftwareDevController {

    private final SoftwareDevService softwareDevService;

    public SoftwareDevController(SoftwareDevService softwareDevService) {
        this.softwareDevService = softwareDevService;
    }

    @GetMapping
    public List<SoftwareDevEntity> getAllDevs() {
        return softwareDevService.fetchDevData();
    }
}
