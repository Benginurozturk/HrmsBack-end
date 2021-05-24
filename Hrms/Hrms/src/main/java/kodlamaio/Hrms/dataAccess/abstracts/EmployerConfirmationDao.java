package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.EmployerConfirmation;
public interface EmployerConfirmationDao extends JpaRepository<EmployerConfirmation, Integer> {

} 


