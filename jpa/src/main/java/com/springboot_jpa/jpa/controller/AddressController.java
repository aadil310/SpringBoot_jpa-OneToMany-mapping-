package com.springboot_jpa.jpa.controller;

import com.springboot_jpa.jpa.Entity.Address;
import com.springboot_jpa.jpa.Repository.AddressRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressRepo repo;

    @GetMapping("/")
    public List<Address> getData(){
        return repo.findAll();
    }

    @PostMapping("/")
    public void saveData(@RequestBody Address obj){
        repo.save(obj);
    }
    
}
