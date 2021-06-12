package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeExperience;


public interface ResumeExperienceService {
	Result add(ResumeExperience jobExpeerience);
	DataResult<List<ResumeExperience>> getAll();
}
