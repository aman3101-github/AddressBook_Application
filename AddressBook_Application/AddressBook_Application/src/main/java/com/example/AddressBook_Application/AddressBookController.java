package com.example.AddressBook_Application;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")
public class AddressBookController {

    // GET Method to fetch all records
    @GetMapping("/fetch")
    public ResponseEntity<String> fetchAllRecords(@RequestBody AddressDTO addressDTO) {
        return ResponseEntity.ok("GET request received: Fetching all addresses.");
    }

    // GET Method to fetch a single record by ID
    @GetMapping("/fetch/{id}")
    public ResponseEntity<String> fetchRecordById(@PathVariable int id) {
        return ResponseEntity.ok("GET request received: Fetching address with ID " + id);
    }

    // POST Method to create a new address record
    @PostMapping("/create")
    public ResponseEntity<String> createRecord() {
        return ResponseEntity.ok("POST request received: Creating a new address record.");
    }

    // PUT Method to update an existing address record
    @PutMapping("/update/{id}")
    public ResponseEntity<String> updateRecord(@PathVariable int id) {
        return ResponseEntity.ok("PUT request received: Updating address record with ID " + id);
    }

    // DELETE Method to delete an address record
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteRecord(@PathVariable int id) {
        return ResponseEntity.ok("DELETE request received: Deleting address record with ID " + id);
    }
}
