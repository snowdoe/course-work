package com.mm.controller;

import com.mm.entity.Student;
import com.mm.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;

/**
 * Created by machu on 2017-06-10.
 */
@RestController
@RequestMapping("/studservice")
public class StudentController {
    @Autowired
    private IStudentService iStudentService;

    @RequestMapping(method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void addStudent(@RequestBody Student student){
        iStudentService.add(student);
    }

    //update
    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudent(@PathVariable Student student) { iStudentService.updateStudent(student);}
    //remove by id
    @RequestMapping(method = RequestMethod.DELETE, value = "/(id)")
    public void deleteStudentById(@PathVariable Long id) { iStudentService.deleteStudentById(id);}

    //getByID
    @RequestMapping(method = RequestMethod.GET, value = "/(id)")
    public void getStudentById (@PathVariable Long id) { iStudentService.getStudentById(id);}
    //getAll
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Collection <Student> getAllStudents() { return iStudentService.getAllStudents();}
}
