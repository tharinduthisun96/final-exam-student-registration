package com.exam.student_details.service.base;

import com.exam.student_details.common.Course;
import com.exam.student_details.common.TransactionRequest;
import com.exam.student_details.common.TransactionResponse;
import com.exam.student_details.domain.Student;
import com.exam.student_details.repository.StudentRepository;
import com.exam.student_details.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.context.annotation.Lazy;
import java.util.List;
@Service
public class BaseStudentService implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    @Lazy
    private RestTemplate template;



    @Override
    public Student create(TransactionRequest s) {
        Course course = s.getCourse();
        Student student = s.getStudent();
        student.setCourse_id(course.getCourseId());

        //Student studentResponse = template.postForObject("", student, Student.class);
        return studentRepository.save(student);
    }


    @Override
    public Student update(Student s) {
        return studentRepository.save(s);
    }

    @Override
    public Student delete(Integer s) {
        Student student = studentRepository.findById(s);
        /*student.setStatus(1);           //Usually we are not deleting data, so we can manage a status for deleted of not, 0 => not deleted, 1 => deleted
        studentRepository.save(student)*/
        studentRepository.delete(student);
        return student;
    }

    @Override
    public List<Student> index() {
        return studentRepository.findAll();
    }

    public TransactionResponse findById(Integer s) {
        Student student = studentRepository.findById(s);
        Course courseResponse = template.getForObject("http://course-registration-client/course/"+student.getCourse_id(),Course.class); //.postForObject(ENDPOINT_URL, payment, Payment.class);
        TransactionResponse tr = new TransactionResponse();
        tr.setStudent(student);
        tr.setCourse(courseResponse);
        return tr;
    }
}
