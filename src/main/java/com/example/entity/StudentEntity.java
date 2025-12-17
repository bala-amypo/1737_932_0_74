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
    private int age;


}