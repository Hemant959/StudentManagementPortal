package com.Hemant.Student_Management_System.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String Department;

    @OneToOne(cascade = CascadeType.ALL)
    private Address address;

    @OneToMany( cascade = CascadeType.ALL)
    Set<Course> courseSet;
}