package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.VerificationCode;
public interface VerificationCodeDao extends JpaRepository<VerificationCode, Integer>{

	//VerificationCode getByVerifyCode(String Code);
	//boolean existsByVerifyCode(String Code);

}
