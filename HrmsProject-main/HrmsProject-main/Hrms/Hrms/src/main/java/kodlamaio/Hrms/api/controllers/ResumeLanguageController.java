package kodlamaio.Hrms.api.controllers;

import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.ResumeLanguageService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeLanguage;


@RestController
@RequestMapping("api/resumeLanguages")
public class ResumeLanguageController {
private ResumeLanguageService resumeLanguageService;

public ResumeLanguageController(ResumeLanguageService resumeLanguageService) {
	super();
	this.resumeLanguageService = resumeLanguageService;
}

@GetMapping("/getall")
public DataResult<List<ResumeLanguage>> getAll() {
	return this.resumeLanguageService.getAll();
}


@PostMapping("/add")
public Result add(ResumeLanguage resumeLanguage)  {
	return this.resumeLanguageService.add(resumeLanguage);
  }

}
