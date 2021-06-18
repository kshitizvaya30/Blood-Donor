package com.bloodcamp.blooddonor.entities;

import com.bloodcamp.blooddonor.dto.BloodRecipientDto;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name = "blood_recipient")
public class BloodRecipient {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "date_of_birth")
	private java.sql.Date dateOfBirth ;

	@OneToOne
	@JoinColumn(name = "required_blood_group_id", referencedColumnName = "id")
	private BloodGroup requiredBloodGroupId;

	@Column(name = "gender")
	private String gender;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "requirement")
	private String requirement;

	@Column(name = "address")
	private String address;

	@Column(name = "message")
	private String message;

	@OneToOne
	@JoinColumn(name = "pincode_id" , referencedColumnName = "id")
	private Pincode pincode;

	@Column(name = "success")
	private String success;



	public static BloodRecipient build(BloodRecipientDto bloodRecipientDto, Pincode pincode, BloodGroup bloodGroup){
		BloodRecipient bloodRecipient = new BloodRecipient();
		bloodRecipient.setFirstName(bloodRecipientDto.getFirstName());
		bloodRecipient.setLastName(bloodRecipientDto.getLastName());
		bloodRecipient.setDateOfBirth(bloodRecipientDto.getDateOfBirth());
		bloodRecipient.setGender(bloodRecipientDto.getGender());
		bloodRecipient.setPhoneNumber(bloodRecipientDto.getPhoneNumber());
		bloodRecipient.setEmail(bloodRecipientDto.getEmail());
		bloodRecipient.setRequirement(bloodRecipientDto.getRequirement());
		bloodRecipient.setAddress(bloodRecipientDto.getAddress());
		bloodRecipient.setMessage(bloodRecipientDto.getMessage());
		bloodRecipient.setPincode(pincode);
		bloodRecipient.setRequiredBloodGroupId(bloodGroup);
		return bloodRecipient;
	}

}