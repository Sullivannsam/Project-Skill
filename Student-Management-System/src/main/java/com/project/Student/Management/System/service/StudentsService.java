package com.project.Student.Management.System.service;

import com.project.Student.Management.System.model.Students;
import com.project.Student.Management.System.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentsService {

    @Autowired
    private repository repo;

    public List<Students> getStudent() {

        List<Students> students = repo.findAll();

        if(students.isEmpty()){
            ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return repo.findAll();
    }

    public Students getStudentById(int id) {

        return repo.findById(id).orElse(
                    new Students(
                            0, "Student Username not found", "Student last Name Not found",
                            null,0,"Email not found"
                    ));
    }

    public void addStudents(Students id) {
        repo.save(id);
    }

    public void updateStudent(Students id) {
        repo.save(id);
    }

    public void deleteStudent(Students id) {
        repo.delete(id);
    }
}
