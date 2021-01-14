package com.exam.student_details.common;

import com.exam.student_details.domain.Student;

public class TransactionResponse {
    private Student student;
    private Course course;


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
