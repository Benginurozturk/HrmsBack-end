package kodlamaio.Hrms.business.concretes;
import kodlamaio.Hrms.entities.concretes.JobPosition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result add(JobPosition jobPosition) {
		if(getJobByTitle(jobPosition.getTitle()).getData() != null){
			return new ErrorResult( jobPosition.getTitle() + " already exists");
		}
		this.jobPositionDao.save(jobPosition);
	    return new SuccessResult("Job position has been added.");
	}


	@Override
	public DataResult<List<JobPosition>> getAll() {
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll());
	}

	@Override
	public DataResult<JobPosition> getJobByTitle(String title) {
		
		return new SuccessDataResult<JobPosition>(this.jobPositionDao.findJobByTitle(title));
	}
	//
//	@Override
//	public Result update(JobPosition jobPosition) {
//		this.jobPositionDao.save(jobPosition);
//      return new SuccessResult("Job position has been updated.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.jobPositionDao.deleteById(id);
//      return new SuccessResult("Job position has been deleted.");
//	}
//

}