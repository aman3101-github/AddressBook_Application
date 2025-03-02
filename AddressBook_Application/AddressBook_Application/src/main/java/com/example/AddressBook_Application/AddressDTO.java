package com.example.AddressBook_Application;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddressDTO {

    // Getters and setters
    // Encapsulated Attributes of the DTO
    private String name;
    private String city;
    private String state;
    private String zipcode;

    // Constructors of the DTO
    public AddressDTO(){}

    public AddressDTO(String name, String city, String state, String zipcode){
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

}
