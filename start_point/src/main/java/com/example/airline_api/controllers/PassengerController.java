package com.example.airline_api.controllers;

import com.example.airline_api.models.Passenger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    private List<Passenger> passengers = new ArrayList<>();

    // Display details of all passengers
    @GetMapping
    public ResponseEntity<List<Passenger>> getAllPassengers() {
        return new ResponseEntity<>(passengers, HttpStatus.OK);
    }

    // Display specific passenger details
    @GetMapping(value = "/{id}")
    public ResponseEntity<Passenger> getPassengerById(@PathVariable Long id) {
        Passenger passenger = passengerService.getPassengerById(id);
        if (passenger != null) {
            return new ResponseEntity<>(passenger, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }


    // Add a new passenger
    @PostMapping
    public ResponseEntity<Passenger> addNewPassenger(@RequestBody Passenger newPassenger) {
        Passenger savedPassenger = passengerService.addPassenger(newPassenger);
        return new ResponseEntity<>(savedPassenger, HttpStatus.CREATED);
    }
}