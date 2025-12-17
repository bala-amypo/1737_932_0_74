package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationTpye;
import jakarta.persistence.Id;


@Entity
public class StudentEntity{

    @Id
    @GeneratedValue(strategy = GenerationTpye.IDENTITY)

    private long id;
    private String name;
    private String email;
    private float cgpa;

    StudentEntity(long id,String name,string email,float cgpa){
    this.id = id;
    this.name = name;
    this.email = email;
    this.cgpa = cgpa;

    }
public void setName(String name){
    this.name = name;
}
public void setEmail(String Email){
    this.email = email;
}
public void setCgpa(String Cgpa){
    this.cgpa = cgpa;
}
public void getname(String name){
    
}

}