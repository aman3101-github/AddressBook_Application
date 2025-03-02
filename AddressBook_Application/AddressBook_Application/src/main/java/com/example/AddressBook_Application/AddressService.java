package com.example.AddressBook_Application;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService{

    // List to store the Address
    List<Address> addressList = new ArrayList<>();

    // ID counter
    int idCounter = 1;
    // Method to get all the records
    public ResponseEntity<List<Address>> getAllRecords() {
        if (addressList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
            return ResponseEntity.ok(addressList);
    }

    // Method to fetch record by ID
    public ResponseEntity<Address> getRecordById(int id){
          Address address = addressList.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No address found for ID: " + id));
        return ResponseEntity.ok(address);
    }

    // Method to create a new record
    public ResponseEntity<Address> createRecord(AddressDTO addressDTO){
        Address address = new Address();
        address.setId(idCounter++);
        address.setName(addressDTO.getName());
        address.setState(addressDTO.getState());
        address.setCity(addressDTO.getCity());
        address.setZipcode(addressDTO.getZipcode());

        addressList.add(address);
        return ResponseEntity.ok(address);

    }

    // Method to update an existing record
    public ResponseEntity<Address> updateRecord(int id, AddressDTO addressDTO){
        return addressList.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .map(a -> {
                    a.setName(addressDTO.getName());
                    a.setCity(addressDTO.getCity());
                    a.setState(addressDTO.getState());
                    a.setZipcode(addressDTO.getZipcode());
                    return ResponseEntity.ok(a);
                })

                .orElseThrow(()-> new RuntimeException("No address record found for ID: " + id));
    }

    // Method to delete an existing record
    public ResponseEntity<Address> deleteRecord(int id){
        Address deletedAddress = addressList.stream()
                .filter(address -> address.getId() == id)
                .findFirst()
                .orElseThrow(()-> new RuntimeException("No address record found for ID: " + id));
            addressList.remove(deletedAddress);
            return ResponseEntity.ok(deletedAddress);
    }

}
