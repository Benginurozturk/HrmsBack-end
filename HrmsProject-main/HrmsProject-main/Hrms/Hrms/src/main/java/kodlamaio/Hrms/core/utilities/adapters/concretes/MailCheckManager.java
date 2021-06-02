package kodlamaio.Hrms.core.utilities.adapters.concretes;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.core.utilities.adapters.abstracts.MailCheckService;
import kodlamaio.Hrms.entities.concretes.User;

@Service
public class MailCheckManager implements MailCheckService {

	@Override
	public boolean sendCheckMail(User user) {
		return true;
	}

}