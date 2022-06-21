package com.springboot_jpa.jpa.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import java.util.List;




@Entity
@Table(name="Student")
public class Student {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column
    private int id;
    @Column
    private String name;

    //join alll the tables...

    @OneToOne
    private Admission admission;

    @OneToMany
    private List<Address> address;

    @ManyToMany
    private List<Teacher> teacher;

    public Student(int id, String name, Admission admission, List<Address> address, List<Teacher> teacher) {
        this.id = id;
        this.name = name;
        this.admission = admission;
        this.address = address;
        this.teacher = teacher;
    }

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Admission getAdmission() {
        return admission;
    }

    public void setAdmission(Admission admission) {
        this.admission = admission;
    }

    public List<Address> getAddress() {
        return address;
    }

    public void setAddress(List<Address> address) {
        this.address = address;
    }

    public List<Teacher> getTeacher() {
        return teacher;
    }

    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }

    


    
}
