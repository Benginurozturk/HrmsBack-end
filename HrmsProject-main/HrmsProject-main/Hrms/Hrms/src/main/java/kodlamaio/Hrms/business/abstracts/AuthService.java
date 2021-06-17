package kodlamaio.Hrms.business.abstracts;


import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employer;
import kodlamaio.Hrms.entities.concretes.JobSeeker;

public interface AuthService<T> {
    Result registerEmployer(Employer employer, String confirmPassword);
	
	Result registerJobSeeker(JobSeeker jobSeeker, String confirmPassword);
	
	//DataResult<T> loginUser(String email, String password);
}
