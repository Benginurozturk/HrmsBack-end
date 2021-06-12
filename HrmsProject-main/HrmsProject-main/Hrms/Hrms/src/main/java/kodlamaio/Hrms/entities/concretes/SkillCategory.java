package kodlamaio.Hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class SkillCategory {
	 @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int id;
	 
	 @JsonIgnore
		@Column(name= "is_active")
		private boolean isActive = true;
		
	 @Column(name = "category_name")
		private String category_name;
}
