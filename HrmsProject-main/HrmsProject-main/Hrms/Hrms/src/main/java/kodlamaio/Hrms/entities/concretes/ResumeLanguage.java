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
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "resume_languages")
@NoArgsConstructor
@AllArgsConstructor
public class ResumeLanguage  {

	
	@NotBlank(message="Boş Geçilemez!")
	@Min(value = 1 )
	@Max(value = 5)	
	@Column(name="level")
	private int level;
	
	@NotBlank(message="Boş Geçilemez!")
	@Column(name="language_name")
	private String languageName;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
	
    @JsonProperty(access = Access.WRITE_ONLY)
		@ManyToOne(targetEntity = ResumeMain.class)
		@JoinColumn(name="resume_main_id")
		private ResumeMain resumeMain;
	
    @Column(name= "created_date", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();


	@Column(name= "is_active")
	private boolean isActive = true;
	
	
}
