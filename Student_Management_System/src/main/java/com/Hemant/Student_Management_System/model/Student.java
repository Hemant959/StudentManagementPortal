package com.Hemant.Student_Management_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
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
    private String id;
    private String name;
    private String age;
    private String phoneNumber;
    private String branch;
    private String Department;

    @OneToOne
    private Address address;

    @OneToMany
    Set<Course> courseSet;
}
