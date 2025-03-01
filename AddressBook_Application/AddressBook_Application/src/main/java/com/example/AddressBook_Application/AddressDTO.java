package com.example.AddressBook_Application;


public class AddressDTO {

    // Encapsulated Attributes of the DTO
    private String name;
    private String address;

    // Constructors of the DTO
    public AddressDTO(){}

    public AddressDTO(String name, String address){
        this.name = name;
        this.address = address;
    }

    // Getters and setters
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }

}
