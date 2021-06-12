package kodlamaio.Hrms.entities.concretes;

import java.util.List;

import javax.persistence.Column; 
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
import lombok.EqualsAndHashCode;


@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
public class Employee extends User {
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="sur_name")
	private String surName;
	
	@JsonIgnore
	@OneToMany(mappedBy = "employee")
	private List<EmployeeConfirmation> employeeConfirmation;
}