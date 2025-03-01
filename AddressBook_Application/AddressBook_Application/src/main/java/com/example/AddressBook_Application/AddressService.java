package com.example.AddressBook_Application;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AddressService{

    // Method to get all the records
    public ResponseEntity<String> getAllRecords(){
        return ResponseEntity.ok("GET request received: Fetching all addresses.");
    }

    // Method to fetch record by ID
    public ResponseEntity<String> getRecordById(int id){
        return ResponseEntity.ok("GET request received: Fetching address with ID " + id);
    }

    // Method to create a new record
    public ResponseEntity<String> createRecord(AddressDTO addressDTO){
        return ResponseEntity.ok("POST request received: Creating a new address record.");
    }

    // Method to update an existing record
    public ResponseEntity<String> updateRecord(int id, AddressDTO addressDTO){
        return ResponseEntity.ok("PUT request received: Updating address record with ID " + id);
    }

    // Method to delete an existing record
    public ResponseEntity<String> deleteRecord(int id){
        return ResponseEntity.ok("DELETE request received: Deleting address record with ID " + id);
    }
}
