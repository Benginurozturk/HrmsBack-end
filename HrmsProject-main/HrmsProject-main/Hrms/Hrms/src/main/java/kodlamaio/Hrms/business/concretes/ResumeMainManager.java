package kodlamaio.Hrms.business.concretes;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;





import kodlamaio.Hrms.business.abstracts.ResumeMainService;


import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.ResumeMainDao;
import kodlamaio.Hrms.entities.concretes.ResumeMain;

@Service
public class ResumeMainManager implements ResumeMainService {

	private ResumeMainDao resumeMainDao;
	
	
	@Autowired
	public ResumeMainManager(ResumeMainDao resumeMainDao) {
		super();
		this.resumeMainDao = resumeMainDao;
		
	}
	
	@Override
	public Result add(ResumeMain resumeMain) {
		this.resumeMainDao.save(resumeMain);
		return new SuccessResult("Cv eklendi.");
	}

	@Override
	public DataResult<List<ResumeMain>> getAll() {

		return new SuccessDataResult<List<ResumeMain>>(this.resumeMainDao.findAll(), "Data getirildi.");
	}

	@Override
	public DataResult<List<ResumeMain>> getAllSortedGradutionYear() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "schoolCv.finishingDate");
		
		return new SuccessDataResult<List<ResumeMain>>
		(this.resumeMainDao.findAll(sort), "Data sıralandı.");
	}

	@Override
	public DataResult<List<ResumeMain>> getAllSortedExperinceYear() {
		
		Sort sort = Sort.by(Sort.Direction.DESC, "jobExp.finishingDate");
		return new SuccessDataResult<List<ResumeMain>>
		(this.resumeMainDao.findAll(sort), "Data sıralandı.");
	}

	@Override
	public DataResult<ResumeMain> getById(int userId) {
		return new SuccessDataResult<ResumeMain>
		(this.resumeMainDao.getById(userId), "Data getirildi.");
		
	}
}
	
	
	