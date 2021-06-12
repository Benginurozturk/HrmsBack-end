package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.User;
public interface UserDao extends JpaRepository<User, Integer> {
	//User getByEmail(String email);
	User getById(int id);
	User findUserByEmail(String email);
}

