package kodlamaio.Hrms.core.utilities.adapters.abstracts;

import kodlamaio.Hrms.entities.concretes.User;

public interface MailCheckService {
	boolean sendCheckMail(User user);
}
