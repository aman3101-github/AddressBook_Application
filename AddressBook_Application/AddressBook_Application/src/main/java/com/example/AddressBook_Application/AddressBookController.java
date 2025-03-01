package com.example.AddressBook_Application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // Dependency Injection using Autowired
    private final AddressService addressService;

    //  Constructor-based Dependency Injection
    @Autowired
    public AddressBookController(AddressService addressService) {
        this.addressService = addressService;
    }

    // GET Method to fetch all records
    @GetMapping("/fetch")
    public ResponseEntity<String> fetchAllRecords() {
        return addressService.getAllRecords();
    }

    // GET Method to fetch a single record by ID
    @GetMapping("/fetch/{id}")
    public ResponseEntity<String> fetchRecordById(@PathVariable int id) {
        return addressService.getRecordById(id);
    }

    // POST Method to create a new address record
    @PostMapping("/create")
    public ResponseEntity<String> createRecord(@RequestBody AddressDTO addressDTO) {
        return addressService.createRecord(addressDTO);
    }

    // PUT Method to update an existing address record
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateRecord(@PathVariable int id, @RequestBody AddressDTO addressDTO) {
        return addressService.updateRecord(id, addressDTO);
    }

    // DELETE Method to delete an address record
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRecord(@PathVariable int id) {
        return addressService.deleteRecord(id);
    }
}
