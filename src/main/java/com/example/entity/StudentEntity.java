package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class StudentEntity{

    @Id
    @GeneratedValue(strategy=)

    private int id;
    private String name;
    private String email;
    private int age;


}