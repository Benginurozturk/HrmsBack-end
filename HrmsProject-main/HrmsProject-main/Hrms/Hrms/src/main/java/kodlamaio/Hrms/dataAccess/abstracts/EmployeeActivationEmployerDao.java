package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.EmployeeActivationEmployer;

public interface EmployeeActivationEmployerDao extends JpaRepository<EmployeeActivationEmployer, Integer>{

}
