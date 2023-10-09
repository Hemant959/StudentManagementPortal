package com.Hemant.Student_Management_System.Service;

import com.Hemant.Student_Management_System.model.Laptop;
import com.Hemant.Student_Management_System.repo.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {
    @Autowired
    ILaptopRepo iLaptopRepo;

    public String addLaptop(Laptop newLaptop) {
        iLaptopRepo.save(newLaptop);
        return "Laptop Added";
    }

    public String updateLaptop(String id, String brand) {
        Laptop laptop=iLaptopRepo.findById(id).orElse(null);
        if(laptop != null){
            laptop.setBrand(brand);
            iLaptopRepo.save(laptop);
            return "Laptop update Successful";
        }
        return "Laptop not found";
    }

    public String deleteLaptopById(String id) {
        iLaptopRepo.deleteById(id);
        return "Laptop deleted";
    }
}
