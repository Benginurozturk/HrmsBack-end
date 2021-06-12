package kodlamaio.Hrms.api.controllers;

import javax.validation.Valid;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.ResumeSkillService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeSkill;


@RestController
@RequestMapping("api/resumeSkills")
public class ResumeSkillController {
   private ResumeSkillService resumeSkillService;

public ResumeSkillController(ResumeSkillService resumeSkillService) {
	super();
	this.resumeSkillService = resumeSkillService;
}

@GetMapping("/getall")
public DataResult<List<ResumeSkill>> getAll(){
	return this.resumeSkillService.getAll();
}


@PostMapping("/add")
public Result add(@Valid @RequestBody ResumeSkill resumeSkill) {
	return this.resumeSkillService.add(resumeSkill);
  }
}
