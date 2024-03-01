package com.example.airline_api.services;

import com.example.airline_api.models.Passenger;
import com.example.airline_api.repositories.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PassengerService {
    private PassengerRepository passengerRepository;

    @Autowired
    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public List<Passenger> getAllPassengers() {
        return passengerRepository.findAll();
    }

    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id).orElse(null);
    }

    public void addPassenger(Passenger passenger) {
        passengerRepository.save(passenger);
    }

    public void updatePassenger(Long id, Passenger passenger) {
        if (passengerRepository.existsById(id)) {
            passenger.setId(id);
            passengerRepository.save(passenger);
        }
    }

    public void deletePassenger(Long id) {
        passengerRepository.deleteById(id);
    }
}



