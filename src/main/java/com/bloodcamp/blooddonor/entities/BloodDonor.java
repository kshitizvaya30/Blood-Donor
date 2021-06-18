package com.bloodcamp.blooddonor.entities;

import com.bloodcamp.blooddonor.dto.BloodDonorDto;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "blood_donor")
public class BloodDonor {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "date_of_birth")
	private java.sql.Date dateOfBirth ; 
	
	@OneToOne
	@JoinColumn(name = "blood_group_id",referencedColumnName ="id")
	private BloodGroup bloodGroupId;
	
	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "address")
	private String address ;
	
	@OneToOne
	@JoinColumn(name = "pincode_id" , referencedColumnName = "id")
	private Pincode pincodeId ;
	
	@Column(name = "gender")
	private String gender;

	@Column(name ="donorOption")
	private String donorOption;

	@Column(name = "email")
	private String email;

	@Column(name = "last_donation_date")
	private java.util.Date lastDonationDate;

	public static BloodDonor build(BloodDonorDto bloodDonorDto,Pincode pincode,BloodGroup bloodGroup){
		BloodDonor bloodDonor = new BloodDonor();
		bloodDonor.setFirstName(bloodDonorDto.getFirstName());
		bloodDonor.setLastName(bloodDonorDto.getLastName());
		bloodDonor.setDateOfBirth(bloodDonorDto.getDateOfBirth());
		bloodDonor.setLastDonationDate(bloodDonorDto.getLastDonationDate());
		bloodDonor.setGender(bloodDonorDto.getGender());
		bloodDonor.setEmail(bloodDonorDto.getEmail());
		bloodDonor.setDonorOption(bloodDonorDto.getDonorOption());
		bloodDonor.setAddress(bloodDonorDto.getAddress());
		bloodDonor.setPhoneNumber(bloodDonorDto.getPhoneNumber());
		bloodDonor.setPincodeId(pincode);
		bloodDonor.setBloodGroupId(bloodGroup);
		return bloodDonor;
	}

}
