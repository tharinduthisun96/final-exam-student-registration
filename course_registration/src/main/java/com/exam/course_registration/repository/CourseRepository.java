package com.exam.course_registration.repository;

import com.exam.course_registration.domain.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer>{

        Course deleteByCourseId(Integer s);
        Course findByCourseId(Integer s);


}
