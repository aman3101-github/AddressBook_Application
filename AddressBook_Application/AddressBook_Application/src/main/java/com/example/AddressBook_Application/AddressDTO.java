package com.example.AddressBook_Application;


public class AddressDTO {

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

    // Getters and setters
    public String getName(){
        return name;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public String getZipcode(){
        return zipcode;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setCity(String city){
        this.city = city;
    }
    public void setState(String state){
        this.state = state;
    }
    public void setZipcode(String zipcode){
        this.zipcode = zipcode;
    }

}
