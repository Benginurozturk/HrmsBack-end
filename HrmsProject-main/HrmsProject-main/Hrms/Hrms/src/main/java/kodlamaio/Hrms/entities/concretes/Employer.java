package kodlamaio.Hrms.entities.concretes;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

import java.util.List;

@EqualsAndHashCode(callSuper = false)
@Data
@Entity

@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "id")
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisement"})
public class Employer extends User{
	
	
		@Column(name = "company_name", unique = true, nullable = false)		//unique = true bu kolonun unique olduğunu belirtir. aynı adla kayıt olunamaz nullable = false bu alan boş olamaz
	 	@NotNull		 //bu alanın boş olamayacağını belirtir.
	 	private String companyName;
	
	 	@Column(name = "web_address", unique = true, nullable = false)
	    @NotNull
	    private String webAddress;
	
	
	    @Column(name = "phone_no", length = 11, unique = true, nullable = false)
	    @NotNull
	    private String phoneNo;
	    
	    @Column(name = "is_verified")
	    private boolean isVerified = false;

	    @OneToMany(mappedBy = "employer")
	    private List<JobAdvertisement> jobAdvertisement;
}