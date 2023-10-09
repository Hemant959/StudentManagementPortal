package com.Hemant.Student_Management_System.Service;

import com.Hemant.Student_Management_System.model.Address;
import com.Hemant.Student_Management_System.repo.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo iAddressRepo;

    public List<Address> getAllAddress() {
        return iAddressRepo.findAll();
    }

    public String addAllAddress(Address newAddress) {
        iAddressRepo.save(newAddress);
        return "creation successfully";
    }

    public String updateAddressById(Long id, String landmark) {
        Address address=iAddressRepo.findById(id).orElse(null);
        if(address != null){
             address.setLandmark(landmark);
             iAddressRepo.save(address);
             return "update successful";
        }
        return"not match";
    }

    public String deleteAddressById(Long id) {
         iAddressRepo.deleteById(id);
         return "deleted";
    }
}
