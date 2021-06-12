package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.VerificationCode;


public interface VerificationCodeService {
	//String createVerifyCode(User user);
	void sendMail(String mail);
    Result add(VerificationCode code);
		
}
