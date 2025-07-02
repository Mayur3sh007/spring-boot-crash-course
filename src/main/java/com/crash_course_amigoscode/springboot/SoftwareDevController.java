package com.crash_course_amigoscode.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/software-devs")
public class SoftwareDevController {

    @GetMapping
    public List<SoftwareDevEntity> getDevs() {
        return List.of(
                new SoftwareDevEntity(
                        1,
                        "Mayuresh",
                        "MERN,Next,Springboot"
                        ),
                new SoftwareDevEntity(
                    2,
                    "Redkira",
                    "hockey,volleyball,cricket"
                )
        );
    }
}
