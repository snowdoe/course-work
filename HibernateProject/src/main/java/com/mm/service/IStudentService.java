package com.mm.service;

import com.mm.entity.Student;

import java.util.Collection;
import java.util.Collections;

/**
 * Created by machu on 2017-06-10.
 */
public interface IStudentService {

    void add(Student student);

    void deleteStudentById(Long id);

    Student getStudentById(Long id);

    void updateStudent(Student student);

    Collection<Student> getAllStudents();
}
