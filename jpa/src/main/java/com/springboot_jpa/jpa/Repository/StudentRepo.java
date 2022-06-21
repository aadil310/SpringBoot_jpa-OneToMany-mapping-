package com.springboot_jpa.jpa.Repository;



import com.springboot_jpa.jpa.Entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepo extends JpaRepository<Student,Integer> {

    
    
}
