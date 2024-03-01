package com.example.airline_api.repositories;

import com.example.airline_api.models.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Repository
public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
