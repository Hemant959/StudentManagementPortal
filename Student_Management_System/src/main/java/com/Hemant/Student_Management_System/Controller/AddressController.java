package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
}
