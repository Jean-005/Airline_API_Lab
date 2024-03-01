package com.example.airline_api.services;

import com.example.airline_api.models.Flight;
import com.example.airline_api.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {
    private FlightRepository flightRepository;

    @Autowired
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }
        public List<Flight> getAllFlights() {
            return flightRepository.findAll();
        }

        public Flight getFlightById(int id) {
            return flightRepository.findById(id);
        }

        public Flight addFlight(Flight flight) {
            flightRepository.save(flight);
            return flight;
        }

        public void updateFlight(Long id, Flight flight) {
            flightRepository.save(id, flight);
        }

        public void deleteFlight(Long id) {
            flightRepository.deleteById(id);
        }

        public Flight addPassengerToFlight(Long id, String passengerName) {
            Flight flight = flightRepository.findById(id).orElse(null);
            if (flight != null) {
            }
            return null;
        }

        public boolean cancelFlight(Long id) {
            if (flightRepository.existsById(id)) {
                flightRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        }
    }




