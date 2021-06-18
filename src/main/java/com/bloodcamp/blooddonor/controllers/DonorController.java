package com.bloodcamp.blooddonor.controllers;

import java.util.List;
import com.bloodcamp.blooddonor.dto.BloodDonorDto;
import com.bloodcamp.blooddonor.entities.BloodGroup;
import com.bloodcamp.blooddonor.entities.Pincode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.bloodcamp.blooddonor.entities.BloodDonor;
import com.bloodcamp.blooddonor.services.DonorService;

@CrossOrigin
@RestController
public class DonorController {
	
	@Autowired
	private DonorService donorService;


	@RequestMapping(method = RequestMethod.GET , value = "/api/donors")
	public List<BloodDonor> getAllDonors(){
		return donorService.getAllDonors();
	}

	@RequestMapping(method = RequestMethod.GET , value ="/api/donors/{id}")
	public BloodDonor getDonor(@PathVariable int id) {
		return donorService.getDonor(id);
	}

	@RequestMapping(method = RequestMethod.POST , value = "/api/donors")
	public void addDonor(@RequestBody BloodDonorDto bloodDonorDto) {
		try{
			Pincode pincode = donorService.findPincode(bloodDonorDto.getPincode());
			BloodGroup bloodGroup = donorService.findBloodGroup(bloodDonorDto.getBloodGroup());
			BloodDonor bloodDonor = BloodDonor.build(bloodDonorDto,pincode,bloodGroup);
			donorService.addDonor(bloodDonor);
		}catch(Exception e){
			System.out.println("Value not found");
		}

	}

	@RequestMapping(method = RequestMethod.DELETE , value = "/api/donors/{id}")
	public void deleteDonor(@PathVariable int id) {
		donorService.deleteDonor(id);
	}
}
