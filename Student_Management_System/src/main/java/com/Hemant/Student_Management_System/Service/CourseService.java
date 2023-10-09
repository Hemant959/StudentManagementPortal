package com.Hemant.Student_Management_System.Service;
import com.Hemant.Student_Management_System.model.Course;
import com.Hemant.Student_Management_System.repo.ICourseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    ICourseRepo iCourseRepo;

    public String addCourses(Course newCourse) {
        iCourseRepo.save(newCourse);
        return "Course Added";
    }

    public List<Course> getAllCourse() {
        return iCourseRepo.findAll();
    }

    public String updateCourseById(String id, String title) {
        Course course = iCourseRepo.findById(id).orElse(null);
        if(course != null){
            course.setTitle(title);
            iCourseRepo.save(course);
            return "Course updated Successfully";
        }
        return "Course doen not found";
    }

    public String deleteCourseById(String id) {
        iCourseRepo.deleteById(id);
        return "Course deleted";
    }
}
