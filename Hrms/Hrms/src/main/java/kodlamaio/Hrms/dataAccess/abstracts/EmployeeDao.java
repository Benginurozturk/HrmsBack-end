package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.Employee;
public interface EmployeeDao extends JpaRepository<Employee, Integer> {

}
