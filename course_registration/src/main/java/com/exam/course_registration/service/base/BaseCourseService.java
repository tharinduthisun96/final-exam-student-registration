package com.exam.course_registration.service.base;

import com.exam.course_registration.domain.Course;
import com.exam.course_registration.repository.CourseRepository;
import com.exam.course_registration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BaseCourseService implements CourseService {
    @Autowired
    private CourseRepository courseRepository;

    @Override
    public Course create(Course c) {
        return courseRepository.save(c);
    }

    @Override
    public Course update(Course c) {
        return courseRepository.save(c);
    }

    @Override
    public Course delete(Integer c) {
        Course course = courseRepository.findByCourseId(c);
        courseRepository.delete(course);
        return course;
    }

    @Override
    public List<Course> index() {
        return courseRepository.findAll();
    }

    public Course findById(Integer c) {
        return courseRepository.findByCourseId(c);
    }
}
