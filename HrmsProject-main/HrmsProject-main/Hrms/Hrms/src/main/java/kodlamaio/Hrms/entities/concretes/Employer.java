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

@PrimaryKeyJoinColumn(name="id")
@Table(name = "employers")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisement"})
public class Employer extends User{
	
	//unique = true bu kolonun unique olduğunu belirtir. aynı adla kayıt olunamaz nullable = false bu alan boş olamaz
	 @Column(name = "company_name", unique = true, nullable = false)
	 //bu alanın boş olamayacağını belirtir.
	 @NotNull
	private String companyName;
	
	 @Column(name = "web_address", unique = true, nullable = false)
	    @NotNull
	private String webaddress;
	
	//lenght verinin karakter uzunluğunu belirtir ama buradan ayarlayamadım.
	    //postgredeki veri türünden ötürü ayarlanmıyor sanırım.
	    @Column(name = "phone_no", length = 11, unique = true, nullable = false)
	    @NotNull
	private String phoneno;
	    
	    // user adlı tablo ile 1 e 1 ilişki kurulduğunu belirtir.
	    @OneToOne
	    private User userEmployer;

	    @OneToMany(mappedBy = "employer")
	    private List<JobAdvertisement> jobAdvertisement;
}