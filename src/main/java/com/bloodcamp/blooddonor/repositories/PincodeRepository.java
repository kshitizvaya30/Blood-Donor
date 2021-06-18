package com.bloodcamp.blooddonor.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bloodcamp.blooddonor.entities.Pincode;

import java.util.Optional;

public interface PincodeRepository extends CrudRepository<Pincode, Integer> {
    Optional<Pincode> findByPincode(int pincode);
}