package kodlamaio.Hrms.core.verification;

public interface VerificationService {
	void sendLink(String email);
	String sendCode();
}
