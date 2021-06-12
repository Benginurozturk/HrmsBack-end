package kodlamaio.Hrms.business.concretes;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.EmployeeConfirmationService;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.EmployeeActivationEmployerDao;
import kodlamaio.Hrms.dataAccess.abstracts.EmployeeConfirmationDao;

import kodlamaio.Hrms.entities.concretes.Employee;
import kodlamaio.Hrms.entities.concretes.EmployeeActivationEmployer;
import kodlamaio.Hrms.entities.concretes.Employer;
import kodlamaio.Hrms.entities.concretes.EmployeeConfirmation;

@Service
public class EmployeeConfirmationManager implements EmployeeConfirmationService {
	
	private EmployeeConfirmationDao employeeConfirmationDao;
	private EmployeeActivationEmployerDao employeeActivationEmployerDao;
	
	
	@Autowired
    public EmployeeConfirmationManager(EmployeeConfirmationDao employeeConfirmationDao, EmployeeActivationEmployerDao employeeActivationEmployerDao) {
		super();
		this.employeeConfirmationDao = employeeConfirmationDao;
		this.employeeActivationEmployerDao = employeeActivationEmployerDao;
	}
	
	@Override
	public void confirmEmployer(Employee employee, Employer employer) {
		EmployeeActivationEmployer cUser = new EmployeeActivationEmployer();
		cUser.getEmployee().setId(employee.getId());
		cUser.getEmployer().setId(employer.getId());
		this.employeeActivationEmployerDao.save(cUser); 
		
	}

	

	@Override
	public Result employeeConfirm(Employee employee) {
				
	
		EmployeeConfirmation cUser = new EmployeeConfirmation();
		cUser.setConfirmed(true);
		cUser.getEmployee().setId(employee.getId());
		employee.setActive(true);
		employeeConfirmationDao.save(cUser);
		return new SuccessResult("Doğrulama Başarılı");
	} 

	@Override
	public Result update(Employer employer) {
		
		
		employeeConfirmationDao.save(employer);
		
		
		return new SuccessResult("Doğrulama Başarılı");
	}
	
	
	

}