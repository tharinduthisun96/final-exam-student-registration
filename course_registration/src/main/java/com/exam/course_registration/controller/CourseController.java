package com.exam.course_registration.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
    @RequestMapping("/Course")
    public String index(){

        return "Course Index";

    }
}
