package com.Hemant.Student_Management_System.Controller;

import com.Hemant.Student_Management_System.Service.AddressService;
import com.Hemant.Student_Management_System.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;
    @PostMapping("api/address/post")
    public String addAllAddress(@RequestBody Address newAddress){
        return addressService.addAllAddress(newAddress);
    }
    @GetMapping("Addres")
    public List<Address> getAllAddress(){
        return addressService.getAllAddress();
    }
    @PutMapping("api/updateAddress")
    public String updateAddressById(@RequestParam Long id,@RequestParam String landmark){
        return addressService.updateAddressById(id,landmark);
    }

    @DeleteMapping("api/deleteAddress")
    public String deleteAddressById(@RequestParam Long id){
        return addressService.deleteAddressById(id);
    }
}
