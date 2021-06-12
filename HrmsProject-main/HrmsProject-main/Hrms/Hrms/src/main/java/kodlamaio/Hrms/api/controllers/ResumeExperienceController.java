package kodlamaio.Hrms.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


import kodlamaio.Hrms.business.abstracts.ResumeExperienceService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeExperience;

@RestController
@RequestMapping("api/resumeExperiences")
public class ResumeExperienceController {
private ResumeExperienceService resumeExperienceService;

public ResumeExperienceController(ResumeExperienceService resumeExperienceService) {
	super();
	this.resumeExperienceService = resumeExperienceService;
}

@GetMapping("/getall")
public DataResult<List<ResumeExperience>> getAll(){
	return this.resumeExperienceService.getAll();
}
	
@PostMapping("/add")
public Result add(ResumeExperience jobExpeerience) {
	return this.resumeExperienceService.add(jobExpeerience);
  }

}
