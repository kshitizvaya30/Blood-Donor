package com.bloodcamp.blooddonor.services;

import java.util.List;

import com.bloodcamp.blooddonor.entities.BloodGroup;
import com.bloodcamp.blooddonor.entities.Pincode;
import com.bloodcamp.blooddonor.repositories.BloodGroupRepository;
import com.bloodcamp.blooddonor.repositories.PincodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodcamp.blooddonor.entities.BloodDonor;
import com.bloodcamp.blooddonor.repositories.BloodDonorRepository;

@Service
public class DonorService {

	@Autowired
	private BloodDonorRepository donorRepository;

	@Autowired
	private PincodeRepository pincodeRepository;

	@Autowired
	private BloodGroupRepository bloodGroupRepository;
	
	public List<BloodDonor> getAllDonors() {
		List<BloodDonor> donors = (List<BloodDonor>) donorRepository.findAll();
		return donors;
	}
	
	public BloodDonor getDonor(int id) {
		return donorRepository.findById(id).get();
	}

	public void addDonor(BloodDonor donor) {
		donorRepository.save(donor);
	}

	public void deleteDonor(int id) {
		donorRepository.deleteById(id);		
	}

	public Pincode findPincode(int pincode){
		return pincodeRepository.findByPincode(pincode).get();
	}

	public BloodGroup findBloodGroup(String bloodGroup){
		return bloodGroupRepository.findByBloodGroup(bloodGroup).get();
	}
}
