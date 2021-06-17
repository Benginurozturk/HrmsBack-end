package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entities.concretes.Employer;
public interface EmployerDao extends JpaRepository<Employer, Integer> {
boolean existsByEmail(String email);
Employer findByCompanyName(String companyName);
Employer getById(int id);
Employer getByCompanyName(String companyName);
boolean existsByCompanyName(String companyName);
//Employer findByUserId(int id);
}
