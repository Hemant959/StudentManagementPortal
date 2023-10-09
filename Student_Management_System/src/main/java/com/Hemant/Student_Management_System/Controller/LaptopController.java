package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.LaptopService;
import com.Hemant.Student_Management_System.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LaptopController {
    @Autowired
    LaptopService laptopService;
    @PostMapping("api/Laptop/post")
    public String addLaptop(@RequestBody Laptop newLaptop){
        return laptopService.addLaptop(newLaptop);
    }
    @PutMapping("api/Laptop/put")
    public String updateLaptop(@RequestParam String id,String brand){
        return laptopService.updateLaptop(id,brand);
    }
    @DeleteMapping("api/Laptop/delete")
    public String deleteLaptopById(@RequestParam String id){
        return laptopService.deleteLaptopById(id);
    }

}
