package com.Hemant.Student_Management_System.Service;

import com.Hemant.Student_Management_System.Controller.AddressController;
import com.Hemant.Student_Management_System.model.Student;
import com.Hemant.Student_Management_System.repo.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;

import java.util.List;

@Service
public class StudentService {
    public AddressController addStudent;
    @Autowired
    IStudentRepo iStudentRepo;

    public String addAllStudent(Student newStudent) {
        iStudentRepo.save(newStudent);
        return "added";
    }

    public List<Student> getAllStudent() {
        return iStudentRepo.findAll();
    }

    public String updateStudentById(String id, String branch) {
        Student student = iStudentRepo.findById(id).orElse(null);
        if(student != null){
            student.setBranch(branch);
            iStudentRepo.save(student);
            return"Student data updated successfully";
        }
        return "Student does not exist";
    }

    public String deleteStudentById(String id) {
        iStudentRepo.deleteById(id);
        return "Deletion Successful";
    }
}
