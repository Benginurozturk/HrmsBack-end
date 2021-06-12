package kodlamaio.Hrms.api.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.EmployeeConfirmationService;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/employerConfirmations")
public class EmployerConfirmationController {

	private EmployeeConfirmationService employerConfirmationService;


public EmployerConfirmationController(EmployeeConfirmationService employerConfirmationService) {
	super();
	this.employerConfirmationService = employerConfirmationService;
}

@PutMapping("/{companyName}")
public Result update(@PathVariable("companyName") String companyName, Employer employer) {
	
	return employerConfirmationService.update(employer);
	
}


}
