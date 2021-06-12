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
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="resume_experiences")
public class ResumeExperience  {
	
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column(name = "id")
	 private int id;
	 
	 
	 @JsonProperty(access = Access.WRITE_ONLY)
		@ManyToOne(targetEntity = ResumeMain.class)
		@JoinColumn(name="resume_main_id")
		private ResumeMain resumeMain;
	


	@Column(name= "ended_date")
	private LocalDate endedDate;
	
	@Column(name= "started_date")
	private LocalDate startedDate;
	
	@NotBlank(message="Şirket İsmi Boş Geçilemez")
	@Column(name= "company_name")
	private String compnayName;
	
	
	@Column(name= "position")
	private String position;
	
	@JsonIgnore  //JSON verisinde gözükmesi istenmeyen anahtarlar özel olarak belirtmek istenirse kullanılır.
	@Column(name= "created_date", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();

	@JsonIgnore
	@Column(name= "is_active")
	private boolean isActive = true;
	
	
	
}
 
