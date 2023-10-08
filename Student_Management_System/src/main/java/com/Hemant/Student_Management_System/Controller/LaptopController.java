package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
}
