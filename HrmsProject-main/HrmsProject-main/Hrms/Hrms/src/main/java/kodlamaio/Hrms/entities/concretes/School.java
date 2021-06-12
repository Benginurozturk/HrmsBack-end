package kodlamaio.Hrms.entities.concretes;

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
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "schools")
public class School {
	
	@Id   
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;	
	
	 @Column(name = "school_name")
	private String schoolName;
	 
	 @NotBlank(message="Boş Geçilemez!")
	 @ManyToOne(targetEntity = City.class)
	 @JoinColumn(name = "city_id")
	 private City city;
	 
	 
	 @Column(name = "status")
	 private boolean isActive;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "school")
	private List<ResumeEducation> resumeEducations;
}
