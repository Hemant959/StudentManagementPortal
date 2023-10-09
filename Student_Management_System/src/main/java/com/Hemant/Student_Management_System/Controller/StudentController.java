package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.StudentService;
import com.Hemant.Student_Management_System.model.Address;
import com.Hemant.Student_Management_System.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("api/student/post")
    public String addAllStudent(@RequestBody Student newStudent){
        return studentService.addAllStudent(newStudent);
    }
    @GetMapping("api/student/get")
    public List<Student>getAllStudent(){
        return studentService.getAllStudent();
    }
    @PutMapping("api/student/put")
    public String updateStudentById(@RequestParam String id,@RequestParam String branch){
        return studentService.updateStudentById(id,branch);
    }
    @DeleteMapping("api/student/delete")
    public String deleteStudentById(@RequestParam String id){
        return studentService.deleteStudentById(id);
    }
}
