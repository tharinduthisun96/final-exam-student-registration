package com.exam.student_details.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @RequestMapping("/Student")
    public String index(){

        return "Student Inedex";

    }
}
