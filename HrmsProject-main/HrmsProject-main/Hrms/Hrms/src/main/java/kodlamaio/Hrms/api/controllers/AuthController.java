package kodlamaio.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.AuthService;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employer;
import kodlamaio.Hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/auth")
public class AuthController<T> {

	@SuppressWarnings("rawtypes")
	private AuthService authService;

	@Autowired
	public AuthController(@SuppressWarnings("rawtypes") AuthService authService) {
		super();
		this.authService = authService;
	}
	
	@PostMapping("/registerEmployer")
	public Result registerEmployer(@RequestBody Employer employer, String confirmPassword)
	{
		return authService.registerEmployer(employer, confirmPassword);
	}
	
	@PostMapping("/registerJobSeeker")
	public Result registerJobSeeker(@RequestBody JobSeeker jobSeeker, String confirmPassword)
	{
		return authService.registerJobSeeker(jobSeeker, confirmPassword);
	}
	
	 //@SuppressWarnings("unchecked")
	//@PostMapping("/login")
	  //  DataResult<T> login(@RequestParam String email, @RequestParam String password) {
	    //    return authService.loginUser(email, password);
	    //}
}
