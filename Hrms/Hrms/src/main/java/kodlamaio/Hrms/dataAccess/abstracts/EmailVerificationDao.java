package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.EmailVerification;
public interface EmailVerificationDao extends JpaRepository<EmailVerification, Integer> {

} 


