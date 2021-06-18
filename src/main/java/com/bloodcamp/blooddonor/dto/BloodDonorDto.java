package com.bloodcamp.blooddonor.dto;

import com.bloodcamp.blooddonor.entities.BloodGroup;
import com.bloodcamp.blooddonor.entities.Pincode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BloodDonorDto {

    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("lastname")
    private String lastName;

    @JsonProperty("dateOfBirth")
    private java.sql.Date dateOfBirth ;

    @JsonProperty("bloodGroup")
    private String bloodGroup;

    @JsonProperty("lastDonated")
    private java.util.Date lastDonationDate;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("email")
    private String email;

    @JsonProperty("donorOption")
    private String DonorOption;

    @JsonProperty("address")
    private String address ;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("pincode")
    private int pincode ;

    @JsonProperty("city")
    private String city ;

    @JsonProperty("state")
    private String state ;

}
