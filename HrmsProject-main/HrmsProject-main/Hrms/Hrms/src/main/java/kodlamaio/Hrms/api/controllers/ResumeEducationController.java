package kodlamaio.Hrms.api.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.ResumeEducationService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeEducation;

@RestController
@RequestMapping("api/resumeEducations")
public class ResumeEducationController {
private ResumeEducationService resumeEducationService;

@Autowired
public ResumeEducationController(ResumeEducationService resumeEducationService) {
	super();
	this.resumeEducationService =resumeEducationService;
}


@PostMapping("/edicationadd")
public Result add(ResumeEducation resumeEducation) {
	return this.resumeEducationService.add(resumeEducation);
}

@GetMapping("/edication")
public DataResult<List<ResumeEducation>> getAll(){
	return this.resumeEducationService.getAll();
}
}
