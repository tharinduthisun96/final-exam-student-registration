package com.exam.student_details.controller;

import com.exam.student_details.common.TransactionResponse;
import com.exam.student_details.domain.Student;
import com.exam.student_details.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

/*
   @RequestMapping("/student")
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody Student Create(@RequestBody CreateStudentRequest createStudentRequest){
        Student student = CreateStudentTransform.createStudentRequestToDomain(createStudentRequest);
        Student studentResponse = studentService.create(student);
        return studentResponse;

    }


    @RequestMapping("/student/delete/{id}")
    @DeleteMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    StudentResponse Delete(@PathVariable Integer id){
        Student studentResponse = studentService.delete(id);
        return CreateStudentTransform.studentDomainToResponse(studentResponse);

    }
    @RequestMapping("/student/update")
    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody StudentResponse Update(@RequestBody UpdateStudentRequest updateStudentRequest){
        Student student = CreateStudentTransform.updateStudentRequestToDomain(updateStudentRequest);
        Student studentResponse = studentService.update(student);
        return CreateStudentTransform.studentDomainToResponse(studentResponse);

    }*/

    @RequestMapping("/student/{id}")
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public @ResponseBody TransactionResponse getById(@PathVariable Integer id){
        TransactionResponse studentResponse = studentService.findById(id);
        return studentResponse;

    }


}
