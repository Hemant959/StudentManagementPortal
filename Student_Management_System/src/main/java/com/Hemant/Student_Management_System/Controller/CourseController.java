package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.CourseService;
import com.Hemant.Student_Management_System.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("api/Course/post")
    public String addCourses(@RequestBody Course newCourse){
        return courseService.addCourses(newCourse);
    }
    @GetMapping("api/Course/get")
    public List<Course>getAllCourse(){
        return courseService.getAllCourse();
    }
    @PutMapping("api/Course/put")
    public String updateCourseById(@RequestParam String id,@RequestParam String title){
        return courseService.updateCourseById(id,title);
    }
    @DeleteMapping("api/Course/delete")
    public String deleteCourseById(@RequestParam String id){
        return courseService.deleteCourseById(id);
    }
}
