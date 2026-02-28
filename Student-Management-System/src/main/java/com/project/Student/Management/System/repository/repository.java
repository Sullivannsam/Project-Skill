package com.project.Student.Management.System.repository;

import com.project.Student.Management.System.model.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface repository extends JpaRepository <Students, Integer> {

}
