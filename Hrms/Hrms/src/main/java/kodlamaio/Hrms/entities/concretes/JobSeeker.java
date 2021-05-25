package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "jobseekers")

public class JobSeeker extends User {
	
	@Column(name="user_id")
	private String userid;
	
	@Column(name="tc_no")
	private String tcno;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="sur_name")
	private String surName;
	
	
	@Column(name="birth_date")
	private LocalDate birthdate;
}