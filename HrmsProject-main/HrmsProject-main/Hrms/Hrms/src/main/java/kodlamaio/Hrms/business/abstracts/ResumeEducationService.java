package kodlamaio.Hrms.business.abstracts;
import java.util.List;


import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeEducation;




public interface ResumeEducationService {
	
	
	
    Result add(ResumeEducation resumeEducation);
	
	DataResult<List<ResumeEducation>> getAll();
	
	
	
	
}
