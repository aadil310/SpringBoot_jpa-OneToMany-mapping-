package com.springboot_jpa.jpa.Repository;

import com.springboot_jpa.jpa.Entity.Teacher;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer>{

    
}
