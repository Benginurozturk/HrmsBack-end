package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.ResumeExperienceService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.ResumeExperienceDao;
import kodlamaio.Hrms.entities.concretes.ResumeExperience;
import java.util.List;

@Service
public class ResumeExperienceManager implements ResumeExperienceService {

	private ResumeExperienceDao resumeExperienceDao;
	

	@Autowired
	public ResumeExperienceManager(ResumeExperienceDao resumeExperienceDao) {
		super();
		this.resumeExperienceDao = resumeExperienceDao;
	;
	}


	@Override
	public Result add(ResumeExperience jobExpeerience) {
		this.resumeExperienceDao.save(jobExpeerience);
		return new SuccessResult("deneyim eklendi");
	}


	@Override
	public DataResult<List<ResumeExperience>> getAll() {
		return new SuccessDataResult<List<ResumeExperience>>
		(this.resumeExperienceDao.findAll(),"deneyim listelendi");
	}
	
	
	
	
} 

