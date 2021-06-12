package kodlamaio.Hrms.business.abstracts;
import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.User;

public interface UserService {
	DataResult<List<User>> getAll();
	Result add(User user);
//	Result update(User user);
//	Result delete(int id);
	DataResult<User> getUserByEmail(String email);
}
