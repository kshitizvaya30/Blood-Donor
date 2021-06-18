package com.bloodcamp.blooddonor.repositories;

import com.bloodcamp.blooddonor.entities.BloodGroup;
import com.bloodcamp.blooddonor.entities.Pincode;
import org.springframework.data.repository.CrudRepository;

import com.bloodcamp.blooddonor.entities.BloodDonor;

import java.util.Optional;

public interface BloodDonorRepository extends CrudRepository<BloodDonor, Integer> {

}