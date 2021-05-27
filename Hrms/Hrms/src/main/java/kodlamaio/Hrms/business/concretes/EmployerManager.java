package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EmployerService;
import kodlamaio.Hrms.core.utilities.adapters.abstracts.MailCheckService;
import kodlamaio.Hrms.core.utilities.adapters.abstracts.MernisCheckService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployerDao;
import kodlamaio.Hrms.entities.concretes.Employer;

import java.util.List;
@Service
public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private MailCheckService mailCheckService;
	private MernisCheckService mernisCheckService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, MailCheckService mailCheckService,MernisCheckService mernisCheckService) {
		super();
		this.employerDao = employerDao;
		this.mailCheckService = mailCheckService;
		this.mernisCheckService= mernisCheckService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employers listed.");
	}

	@Override
	public Result add(Employer employer) {
		
		if(!this.mailCheckService.sendCheckMail(employer)) {
			
			return new ErrorResult("Mail or anything failed.");
		} else if(!this.mernisCheckService.checkIfRealPerson(employer)) {
			return new ErrorResult("Mernis or anything failed.");
			
		}else if (this.employerDao.existsByEmail(employer.getEmail())){
			return new ErrorResult("EMail or anything failed.");
		}else  {
			this.employerDao.save(employer);
			return new SuccessResult("Employer succesfully signed up");
		}
		
	
		
		
		
		
	}
	
//	@Override
//	public void update(Employer employer) {
//		this.employerDao.save(employer);
//      return new SuccessResult("Employer has been updated.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.employerDao.deleteById(id);
//	    return new SuccessResult("Employer has been deleted.");
//	}
//

}
