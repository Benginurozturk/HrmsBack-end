package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity

@PrimaryKeyJoinColumn(name="id")
@Table(name = "employers")
public class Employer extends User{
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_address")
	private String webaddress;
	
	@Column(name="phone_no")
	private String phoneno;
}