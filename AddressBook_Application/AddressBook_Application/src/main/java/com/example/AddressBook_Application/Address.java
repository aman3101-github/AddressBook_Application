package com.example.AddressBook_Application;

import jakarta.persistence.Entity;

@Entity
public class Address {

    // Encapsulated Attributes of the model
    private int id;
    private String name;
    private String colony;
    private String city;

    // Constructors of the class
    public Address() {}

    public Address(int id, String name, String colony, String city){
        this.id = id;
        this.name = name;
        this.colony = colony;
        this.city = city;
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
    public String getColony(){
        return colony;
    }

    // Setters method
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setColony(String colony){
        this.colony = colony;

    }
    public void setCity(String city){
        this.city = city;
    }
}
