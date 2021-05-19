package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity
@Table(name = "email_verification")

public class EmailVerification extends User {
	
	@Column(name="user_id")
	private int userid;
	
	
	
	@Column(name="codes")
	private String codes;
	
	@Column(name=" is_verified")
	private String  isverified;
}