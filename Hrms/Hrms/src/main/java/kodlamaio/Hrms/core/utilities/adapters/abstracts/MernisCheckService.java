package kodlamaio.Hrms.core.utilities.adapters.abstracts;

import kodlamaio.Hrms.entities.concretes.User;

public interface MernisCheckService {
	boolean checkIfRealPerson(User user);
}
