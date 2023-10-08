package com.Hemant.Student_Management_System.Service;

import com.Hemant.Student_Management_System.repo.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    IBookRepo iBookRepo;
}
