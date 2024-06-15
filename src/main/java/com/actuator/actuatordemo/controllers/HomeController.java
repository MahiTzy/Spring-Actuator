package com.actuator.actuatordemo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.actuator.actuatordemo.helper.Student;

@RestController
public class HomeController {

    @Autowired
    private Student student;

    @GetMapping("/home")
    public Map<String, String> home() {
        return Map.of("message", "Hello, World!", "student", student.getStudentName());
        // return Map.of("message", "Hello, World!");

    }

}
