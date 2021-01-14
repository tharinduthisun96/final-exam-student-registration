package com.exam.student_details.service;

import com.exam.student_details.common.TransactionRequest;
import com.exam.student_details.common.TransactionResponse;
import com.exam.student_details.domain.Student;

import java.util.List;

public interface StudentService {

    Student create(TransactionRequest s);
    Student update(Student s);
    Student delete(Integer s);
    List<Student> index();
    public TransactionResponse findById(Integer s);
}
