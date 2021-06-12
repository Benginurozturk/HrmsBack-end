package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.ResumeLanguage;
public interface ResumeLanguageDao extends JpaRepository<ResumeLanguage, Integer> {

} 