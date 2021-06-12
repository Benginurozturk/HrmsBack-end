package kodlamaio.Hrms.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.EmployeeConfirmation;
import kodlamaio.Hrms.entities.concretes.Employer;
public interface EmployeeConfirmationDao extends JpaRepository<EmployeeConfirmation, Integer> {
	List<EmployeeConfirmation>	getByEmployee_Id(int employeeId);
	List<EmployeeConfirmation> existsByEmployee_Id(int employeeId);
	List<EmployeeConfirmation> getByIsConfirmed(boolean isConfirmed);
	void save(Employer employer);
} 



