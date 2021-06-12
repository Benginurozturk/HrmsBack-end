package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import kodlamaio.Hrms.entities.concretes.ResumeEducation;
public interface ResumeEducationDao extends JpaRepository<ResumeEducation, Integer> {

	//List<ResumeEducation> findAllByResumeIdOrderByEndedDateDesc(int id);
	
}