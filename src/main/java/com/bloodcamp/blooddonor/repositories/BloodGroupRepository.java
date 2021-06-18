package com.bloodcamp.blooddonor.repositories;

import org.springframework.data.repository.CrudRepository;

import com.bloodcamp.blooddonor.entities.BloodGroup;

import java.util.Optional;

public interface BloodGroupRepository extends CrudRepository<BloodGroup, Integer> {

    Optional<BloodGroup> findByBloodGroup(String bloodGroup);
}