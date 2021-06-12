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

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@Table(name = "resume_images")
@NoArgsConstructor
@AllArgsConstructor
public class ResumeImage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne // 
	@JoinColumn(name = "resume_main_id")
	private ResumeMain resumeMain;
	
	@Column(name = "url_address")
	private String urlAddress;
	
	

	@JsonIgnore
	@Column(name= "created_date", columnDefinition = "Date defult CURRENT_DATE")
	private LocalDate createdDate = LocalDate.now();

	@JsonIgnore
	@Column(name= "is_active")
	private boolean isActive = true;
	

}


/* FetchType, aralarında ilişki bulunan entitylerden bir tarafı(candidate) yüklerken diğer tarafın(image)
yüklenme  stratejisini belirlememize olanak sağlar.
2 tip yükleme stratejisi var.Ben burada LAZY( Sonradan Yükleme) stratejisini kullandım.
Ayrıca adresin isteğe bağlı değil zorunlu olduğunu optional=false ile belirttim, bu Fetch yapısının
daha doğru çalışmasına yardım eder
*/