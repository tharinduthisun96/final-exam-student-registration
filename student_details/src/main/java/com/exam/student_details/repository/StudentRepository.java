package com.exam.student_details.repository;

import com.exam.student_details.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
    Student deleteById(Integer s);
    Student findById(Integer s);
}
