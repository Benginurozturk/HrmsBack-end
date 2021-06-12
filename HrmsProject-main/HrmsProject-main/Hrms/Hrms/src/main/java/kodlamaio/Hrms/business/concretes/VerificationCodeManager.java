package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.VerificationCodeService;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.VerificationCodeDao;
import kodlamaio.Hrms.entities.concretes.VerificationCode;




@Service
public class VerificationCodeManager implements VerificationCodeService {

	
private VerificationCodeDao verificationCodeDao;
	
	@Autowired
	public VerificationCodeManager(VerificationCodeDao verificationCodeDao) {
		super();
		this.verificationCodeDao = verificationCodeDao;
	}
	
     @Override
     public void sendMail(String mail) {
	System.out.println("Doğrulama Maili Gönderildi : " + mail);
	}

     @Override
 	public Result add(VerificationCode code) {
 		
 		this.verificationCodeDao.save(code);
 		return new SuccessResult("Code has been saved.");
 	}

	
	
		

} 
