package kodlamaio.Hrms.entities.concretes;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonProperty;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="resume_educations")
public class ResumeEducation  {
		
		@Id   
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;	
		 
		@JsonProperty
		@ManyToOne()  // bende aynı yaptım böyle ama hata vermedi bi sıkıntı var sanırım bütün tabloları mı kontrol etsek tablolarla alakalı değil entitylerde bi sorun var yeniden mi yazım :(( yok bakacağız işte
	    @JoinColumn(name = "resume_main_id", referencedColumnName = "id")
	    private ResumeMain resumeMain;		
		
		@NotBlank(message="Boş Geçilemez!")
		@ManyToOne(targetEntity = School.class)
		@JoinColumn(name = "school_id")
		private School school; 
		
		@NotBlank(message="Boş Geçilemez!")
		@Column(name = "department")
		private String department;
		
		@NotBlank(message="Boş Geçilemez!")
		@Column(name = "started_date")
		private Date startedDate;
		
		@NotBlank(message="Boş Geçilemez!")
		@Column(name = "ended_date", nullable = true)
		private Date endedDate;
		
		

}