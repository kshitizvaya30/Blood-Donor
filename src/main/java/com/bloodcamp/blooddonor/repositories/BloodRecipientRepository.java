package com.bloodcamp.blooddonor.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bloodcamp.blooddonor.entities.BloodRecipient;


public interface BloodRecipientRepository extends CrudRepository<BloodRecipient, Integer> {

}