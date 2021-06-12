package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employee;
import kodlamaio.Hrms.entities.concretes.Employer;

public interface EmployeeConfirmationService {
	void confirmEmployer(Employee employee, Employer employer);
	Result employeeConfirm(Employee employee);
	
	Result update(Employer employer);
}