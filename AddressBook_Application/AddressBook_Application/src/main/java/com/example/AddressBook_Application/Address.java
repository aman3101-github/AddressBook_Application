package com.example.AddressBook_Application;

import jakarta.persistence.Entity;

@Entity
public class Address {

    // Encapsulated Attributes of the model
    private int id;
    private String name;
    private String city;
    private String state;
    private String zipcode;

    // Constructors of the class
    public Address() {}

    public Address(int id, String name, String city, String state, String zipcode){
        this.id = id;
        this.name = name;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    // getters method
    public int getId(){
        return id;
    }
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

    // Setters method
    public void setId(int id){
        this.id = id;
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
