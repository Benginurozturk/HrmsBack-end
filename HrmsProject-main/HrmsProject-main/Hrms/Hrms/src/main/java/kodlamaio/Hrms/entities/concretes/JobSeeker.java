package kodlamaio.Hrms.entities.concretes;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data 
@EqualsAndHashCode(callSuper=false)
@Entity
@Table(name = "jobseekers") // asdad
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@PrimaryKeyJoinColumn(name = "user_id")
public class JobSeeker extends User {

	@Size(min = 3,message = "İsim alanında en az 3 karakter kullanmanız gerekiyor") 
	@NotBlank(message="Boş Geçilemez!")
	@Column(name= "first_name")
	private String firstName;
	
	@NotBlank(message="Boş Geçilemez!")  
	@Column(name= "last_name")
	private String lastName;	
	
	@NotBlank(message="TC Kimlik Numarası Alanı Boş Olamaz") 
	@Size(min = 11, max=11, message = "TCKimlik No 11 hane olmalıdır")
	@Column(name= "nationality_id")
	private String nationalId;

	@NotNull
	@Column(name= " birth_date")
	private int birthDate; 
	
	
	@Column(name = "is_verified", columnDefinition = "boolean default false")
	private boolean isVerified = false;
} 

	/*@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeEducation> educations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeSkill> programingSkills;
	
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeLanguage> languages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "jobseeker")
	private List<ResumeExperience> experiences;
	
	

	@JsonIgnore
	@OneToOne(mappedBy = "jobseekers",optional = false, fetch = FetchType.LAZY)
	private ResumeImage image;

}*/
 