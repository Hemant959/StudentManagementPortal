package com.Hemant.Student_Management_System.repo;

import com.Hemant.Student_Management_System.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Long> {

}
