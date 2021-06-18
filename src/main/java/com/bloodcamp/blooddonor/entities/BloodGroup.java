package com.bloodcamp.blooddonor.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "blood_group")
public class BloodGroup {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	
	@Column(name = "name")
	private String bloodGroup;

	
}
