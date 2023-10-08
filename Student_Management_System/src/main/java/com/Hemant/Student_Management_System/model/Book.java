package com.Hemant.Student_Management_System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String Description;
    private String price;

    @ManyToOne
    private Student student;
}
