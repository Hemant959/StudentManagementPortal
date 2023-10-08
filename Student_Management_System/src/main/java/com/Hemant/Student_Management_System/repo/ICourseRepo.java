package com.Hemant.Student_Management_System.repo;

import com.Hemant.Student_Management_System.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICourseRepo extends JpaRepository<Course,String> {

}
