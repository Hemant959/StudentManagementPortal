package com.Hemant.Student_Management_System.model;

import jakarta.persistence.Id;

public class Address {
    @Id
    private Long addressId;
    private String landmark;
    private String zipcode;
    private String district;
    private String state;
    private String country;

}
