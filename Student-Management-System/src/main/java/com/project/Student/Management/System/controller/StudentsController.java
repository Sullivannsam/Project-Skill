package com.project.Student.Management.System.controller;

import com.project.Student.Management.System.model.Students;
import com.project.Student.Management.System.repository.repository;
import com.project.Student.Management.System.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    private StudentsService service;

    @GetMapping("/students")
    public List<Students> getAllStudents(Students student){
        return service.getStudent();
    }

    @RequestMapping("/students/{id}")
    public Students getStudentById(@PathVariable int id){
        return service.getStudentById(id);
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Students id){
        service.addStudents(id);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Students id ){
        service.updateStudent(id);
    }

    @DeleteMapping("student")
    public void deleteStudent(@RequestBody Students id){
        service.deleteStudent(id);
    }


}
