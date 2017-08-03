package com.mm.service;

import com.mm.dao.StudentRepository;
import com.mm.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Created by machu on 2017-06-10.
 */
@Service
public class StudentService implements IStudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override

    public void add(Student student) {
        studentRepository.save(student);
    }

    @Override
    public void deleteStudentById(Long id) {
        studentRepository.delete(id);
    }
    @Override

    public Student getStudentById(Long id){
        return studentRepository.getOne(id);
    }

    @Override

    public void updateStudent(Student student) {
        studentRepository.save(student);
    }
    @Override
    //@RequestMapping (method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
