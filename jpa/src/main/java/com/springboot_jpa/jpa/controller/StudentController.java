package com.springboot_jpa.jpa.controller;

import com.springboot_jpa.jpa.Entity.Student;
import com.springboot_jpa.jpa.Repository.StudentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentRepo repo;

    @GetMapping("/")
    public List<Student> getData(){
        return repo.findAll();
    }

    @PostMapping("/")
    public void saveData(@RequestBody Student obj){
        repo.save(obj);
    }

    @PutMapping("/")
	public void updateData(@RequestBody Student obj) {
		repo.save(obj);
	}
    

}
