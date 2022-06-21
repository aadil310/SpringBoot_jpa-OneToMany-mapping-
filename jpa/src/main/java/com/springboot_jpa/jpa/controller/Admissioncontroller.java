package com.springboot_jpa.jpa.controller;

import com.springboot_jpa.jpa.Entity.Admission;
import com.springboot_jpa.jpa.Repository.AdmissionRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/admission")
public class Admissioncontroller {
    @Autowired
    AdmissionRepo repo;

    @GetMapping("/")
    public List<Admission> getData(){
        return repo.findAll();
    }

    @PostMapping("/")
    public void saveData(@RequestBody Admission obj){
        repo.save(obj);
    }
    
}
