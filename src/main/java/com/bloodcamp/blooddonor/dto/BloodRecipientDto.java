package com.bloodcamp.blooddonor.dto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class BloodRecipientDto {


    @JsonProperty("firstname")
    private String firstName;

    @JsonProperty("lastname")
    private String lastName;

    @JsonProperty("dateOfBirth")
    private java.sql.Date dateOfBirth ;

    @JsonProperty("bloodGroup")
    private String bloodGroup;

    @JsonProperty("gender")
    private String gender;

    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @JsonProperty("email")
    private String email;

    @JsonProperty("requirement")
    private String requirement;

    @JsonProperty("address")
    private String address ;

    @Column(name = "message")
    private String message;

    @JsonProperty("pincode")
    private int pincode ;

    @JsonProperty("city")
    private String city ;

    @JsonProperty("state")
    private String state ;

}
