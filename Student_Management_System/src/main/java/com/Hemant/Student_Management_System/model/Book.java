package com.Hemant.Student_Management_System.model;

import jakarta.persistence.*;
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
    @JoinColumn(name = "student_id")
    private Student student;
}
