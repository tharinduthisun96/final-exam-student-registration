package com.exam.course_registration.controller;

import com.exam.course_registration.domain.Course;
import com.exam.course_registration.service.CourseService;
import com.exam.course_registration.service.dto.CreateCourseRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    @RequestMapping("/Course")
    public String index(){

        return "Course Index";

    }

    @RequestMapping("/course/{id}")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Course getById(@PathVariable Integer id){
        Course studentResponse = courseService.findById(id);
        return studentResponse;

    }


    @RequestMapping("/course/delete/{id}")
    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Course Delete(@PathVariable Integer id){
        Course studentResponse = courseService.delete(id);
        return studentResponse;

    }
    @RequestMapping("/course/update")
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Course Update(@RequestBody Course course){

        Course courseResponse = courseService.update(course);
        return courseResponse;

    }

}
