package com.project.Student.Management.System.controller;

import com.project.Student.Management.System.model.Students;
import com.project.Student.Management.System.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentsController {

    @Autowired
    private StudentsService service;


    @RequestMapping("/students")
    public List<Students> getAllStudents(){
        return service.getStudent();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity <Students> getStudentById(@PathVariable int id){
        Students student = service.getStudentById(id);

        if(student != null){
            return new ResponseEntity<>(student, HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/students")
    public void addStudent(@RequestBody Students id){
        service.addStudents(id);
    }

    @PutMapping("/students")
    public void updateStudent(@RequestBody Students id ){
        service.updateStudent(id);
    }

    @DeleteMapping("/students/{id}")
    public void  deleteStudent(@PathVariable Students id){
        service.deleteStudent(id);
    }


}
