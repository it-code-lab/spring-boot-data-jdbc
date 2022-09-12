package com.example.demo.service;

import com.example.demo.model.Student;
import com.example.demo.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepo repo;

    public void getAllStudents(){
        List<Student> list = (List<Student>) repo.findAll();
        list.stream().forEach( (st)-> System.out.println(st));
    }

    public void AddStudents(){

        repo.save(new Student("Ana", "One"));
        repo.save(new Student("Bob", "Two"));
        repo.save(new Student("Claire", "One"));
    }
}
