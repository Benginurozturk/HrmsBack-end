package kodlamaio.Hrms.entities.concretes;


import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="resume_main")
public class ResumeMain {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "id")
	private int id;
	
	@JsonProperty(access = Access.WRITE_ONLY)
	@ManyToOne()
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;  // bak mesela bu başka entity den geliyor o zaman olur mu burada sadece id gelmez swagger açtığında. jobseeker in tamamı gelir
	
	@Column(name= "github_link")
	private String githubLink;
	
	@Column(name= "linkedin_link")
	private String linkedinLink;
	
	
	@Column(name= "created_date")
	private LocalDate createdDate = LocalDate.now();


	@Column(name= "is_active")
	private boolean isActive = true;
	
	@Column(name= "cover_letter")
	private String coverLetter;

	@Column(name= "resume_title")
	private String resumeTitle;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resumeMain")
    private List<ResumeEducation> resumeEducations;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resumeMain")
    private List<ResumeExperience> resumeExperiences;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resumeMain")
    private List<ResumeImage> resumeImages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resumeMain")
    private List<ResumeLanguage> resumeLanguages;
	
	@JsonIgnore
	@OneToMany(mappedBy = "resumeMain")
    private List<ResumeSkill> resumeSkills;
}
