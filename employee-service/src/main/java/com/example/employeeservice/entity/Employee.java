package com.example.employeeservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

public class Employee {
    @Id
    private String id;
    @Field
    private String name;
    @Field
    private String designation;
    @Field
    private double salary;
}
