package com.Hemant.Student_Management_System.repo;

import com.Hemant.Student_Management_System.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student,String> {
}
