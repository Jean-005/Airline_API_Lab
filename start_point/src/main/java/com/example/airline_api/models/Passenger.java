package com.example.airline_api.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;


@Entity(name = "passengers")
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @ManyToMany(mappedBy = "passengers")
    private List<Flight> flights;

    public Passenger(String name, String email) {
        this.name = name;
        this.email = email;
        this.flights = new ArrayList<>();
    }
        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Flight> getFlights() {
            return flights;
        }

        public void setFlights(List<Flight> flights) {
            this.flights = flights;
        }
    }
