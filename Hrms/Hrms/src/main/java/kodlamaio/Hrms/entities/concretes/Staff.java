package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "staffs")

public class Staff extends User {
	
	@Column(name="user_id")
	private String userid;
	
	
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="sur_name")
	private String surName;
}