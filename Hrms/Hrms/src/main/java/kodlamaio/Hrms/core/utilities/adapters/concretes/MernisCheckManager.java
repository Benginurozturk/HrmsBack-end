package kodlamaio.Hrms.core.utilities.adapters.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.adapters.abstracts.MernisCheckService;
import kodlamaio.Hrms.entities.concretes.User;

@Service
public class MernisCheckManager implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(User user) {
		return true;
	}

}
