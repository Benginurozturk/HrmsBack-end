package kodlamaio.Hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import kodlamaio.Hrms.business.abstracts.ResumeEducationService;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.ResumeEducationDao;
import kodlamaio.Hrms.entities.concretes.ResumeEducation;


@Service
public class ResumeEducationManager implements ResumeEducationService{

	private ResumeEducationDao resumeEducationDao;
	
		
	
	
	
	@Autowired	
	public ResumeEducationManager(ResumeEducationDao resumeEducationDao) {
		super();
		this.resumeEducationDao = resumeEducationDao;

	}




	@Override
	public Result add(ResumeEducation resumeEducation) {
		// TODO Auto-generated method stub
		this.resumeEducationDao.save(resumeEducation);
		return new SuccessResult("okul eklendi");
	}




	@Override
	public DataResult<List<ResumeEducation>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<ResumeEducation>>(this.resumeEducationDao.findAll(),"listelendi");
	}

	
	
} 


