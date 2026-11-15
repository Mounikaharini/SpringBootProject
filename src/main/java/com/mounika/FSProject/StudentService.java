package com.mounika.FSProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.*;
import repository.*;

@Service
public class StudentService {

    @Autowired
    StudentRepository repository;

    public void saveStudent(Student student)
    {
        repository.save(student);
    }

}
