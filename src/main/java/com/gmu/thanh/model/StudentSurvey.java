package com.gmu.thanh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="student_survey")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentSurvey {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@JsonIgnore
	private Integer id;
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zipcode;
	private String telephoneNumber;
	private String email;
	private String date;
	private String[] thingsLiked;
	private String interested;
	private String recommendation;
}
