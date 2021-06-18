package com.bloodcamp.blooddonor.services;

import java.util.List;

import com.bloodcamp.blooddonor.entities.BloodGroup;
import com.bloodcamp.blooddonor.entities.Pincode;
import com.bloodcamp.blooddonor.repositories.BloodGroupRepository;
import com.bloodcamp.blooddonor.repositories.PincodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodcamp.blooddonor.entities.BloodDonor;
import com.bloodcamp.blooddonor.entities.BloodRecipient;
import com.bloodcamp.blooddonor.repositories.BloodRecipientRepository;

@Service
public class RecipientServices {

	@Autowired
	private BloodRecipientRepository recipientRepository;

	@Autowired
	private PincodeRepository pincodeRepository;

	@Autowired
	private BloodGroupRepository bloodGroupRepository;
	
	public List<BloodRecipient> getAllRecipients() {
		List<BloodRecipient> recipient = (List<BloodRecipient>) recipientRepository.findAll();
		return recipient;
	}
	public BloodRecipient getRecipient(int id) {
		return recipientRepository.findById(id).get();
	}

	public void addRecipient(BloodRecipient recipient) {
		recipientRepository.save(recipient);
	}

	public void deleteRecipient(int id) {
		recipientRepository.deleteById(id);		
	}

	public Pincode findPincode(int pincode){
		return pincodeRepository.findByPincode(pincode).get();
	}

	public BloodGroup findBloodGroup(String bloodGroup){
		return bloodGroupRepository.findByBloodGroup(bloodGroup).get();
	}

}
