package com.project.Student.Management.System.service;

import com.project.Student.Management.System.model.Students;
import com.project.Student.Management.System.repository.repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentsService {

    @Autowired
    private repository repo;

    public List<Students> getStudent() {
        return repo.findAll();
    }

    public Students getStudentById(int id) {
        return repo.findById(id).orElse(

                new Students( 0, "not found", 0,
                        null, "not found",
                        false, "not found"
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
