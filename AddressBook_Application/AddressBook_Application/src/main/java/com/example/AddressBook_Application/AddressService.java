package com.example.AddressBook_Application;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Service
public class AddressService{

    // List to store the Address
    List<Address> addressList = new ArrayList<>();

    // ID counter
    int idCounter = 1;
    // Method to get all the records
    public ResponseEntity<List<Address>> getAllRecords() {
        log.info("Fetching all the records.");
        if (addressList.isEmpty()) {
            log.warn("No records found!");
            return ResponseEntity.noContent().build();
        }
            return ResponseEntity.ok(addressList);
    }

    // Method to fetch record by ID
    public ResponseEntity<Address> getRecordById(int id){
        log.info("Fetching the record for the ID {}", id);
          Address address = addressList.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .orElseThrow(()-> {
                    log.error("No record found for ID {}", id);
                    return new RuntimeException("No address found for ID: " + id);
                });
        return ResponseEntity.ok(address);
    }

    // Method to create a new record
    public ResponseEntity<Address> createRecord(AddressDTO addressDTO){
        log.info("Creating new record.");
        Address address = new Address();
        address.setId(idCounter++);
        address.setName(addressDTO.getName());
        address.setState(addressDTO.getState());
        address.setCity(addressDTO.getCity());
        address.setZipcode(addressDTO.getZipcode());

        addressList.add(address);
        log.debug("Address created successfully: {}", address);
        return ResponseEntity.ok(address);

    }

    // Method to update an existing record
    public ResponseEntity<Address> updateRecord(int id, AddressDTO addressDTO){
        log.info("Updating the record for ID {}", id);
        return addressList.stream()
                .filter(a -> a.getId() == id)
                .findFirst()
                .map(a -> {
                    a.setName(addressDTO.getName());
                    a.setCity(addressDTO.getCity());
                    a.setState(addressDTO.getState());
                    a.setZipcode(addressDTO.getZipcode());
                    log.debug("Record updated for ID {}", id);
                    return ResponseEntity.ok(a);
                })

                .orElseThrow(()-> {
                    log.error("No record found for the ID {}", id);
                    return new RuntimeException("No address record found for ID: " + id);
                });
    }

    // Method to delete an existing record
    public ResponseEntity<Address> deleteRecord(int id){
        log.info("Deleting address record for ID: {}", id);
        Address deletedAddress = addressList.stream()
                .filter(address -> address.getId() == id)
                .findFirst()
                .orElseThrow(()-> {
                    log.error("No address found for ID {}", id);
                    return new RuntimeException("No address record found for ID: " + id);
                  });
            addressList.remove(deletedAddress);
            log.debug("Deleted address: {}", deletedAddress);
            return ResponseEntity.ok(deletedAddress);
    }

}
