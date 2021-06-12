package kodlamaio.Hrms.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@Table(name="resume_skills")
@NoArgsConstructor
@AllArgsConstructor
public class ResumeSkill  {
	
	@NotBlank(message="Boş Geçilemez!")
	@Column(name = "skill_name")
	private String skillName;
	

	
	
	@Column(name= "created_date", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();

	@JsonIgnore
	@Column(name= "is_active")
	private boolean isActive = true;
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "id")
	 private int id;
	 
	 @JsonProperty(access = Access.WRITE_ONLY)
		@ManyToOne(targetEntity = ResumeMain.class)
		@JoinColumn(name="resume_main_id")
		private ResumeMain resumeMain;
	

	 
	
	    @Column(name = "category_id")
	    private int categoryId;
}
