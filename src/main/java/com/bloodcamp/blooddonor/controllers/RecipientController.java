package com.bloodcamp.blooddonor.controllers;

import java.util.List;

import com.bloodcamp.blooddonor.dto.BloodRecipientDto;
import com.bloodcamp.blooddonor.entities.BloodGroup;
import com.bloodcamp.blooddonor.entities.Pincode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bloodcamp.blooddonor.entities.BloodRecipient;
import com.bloodcamp.blooddonor.services.RecipientServices;

@CrossOrigin
@RestController
public class RecipientController {

	@Autowired
	private RecipientServices recipientService;
	
	@RequestMapping("/api/recipients")
	public List<BloodRecipient> getAllRecipients(){
		return recipientService.getAllRecipients();
	}
	
	@RequestMapping("/api/recipients/{id}")
	public BloodRecipient getRecipient(@PathVariable int id) {
		return recipientService.getRecipient(id);
	}
	
	@RequestMapping(method = RequestMethod.POST , value = "/api/recipients")
	public void addRecipient(@RequestBody BloodRecipientDto bloodRecipientDto) {
		Pincode pincode = recipientService.findPincode(bloodRecipientDto.getPincode());
		BloodGroup bloodGroup = recipientService.findBloodGroup(bloodRecipientDto.getBloodGroup());
		BloodRecipient bloodRecipient = BloodRecipient.build(bloodRecipientDto,pincode,bloodGroup);
		recipientService.addRecipient(bloodRecipient);
	}
		
	@RequestMapping(method = RequestMethod.DELETE , value = "/api/recipients/{id}")
	public void deleteRecipient(@PathVariable int id) {
		recipientService.deleteRecipient(id);
	}
	
}
