package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeSkill;


public interface ResumeSkillService {
Result add(ResumeSkill resumeSkill);
	
	DataResult<List<ResumeSkill>> getAll();
	
}
