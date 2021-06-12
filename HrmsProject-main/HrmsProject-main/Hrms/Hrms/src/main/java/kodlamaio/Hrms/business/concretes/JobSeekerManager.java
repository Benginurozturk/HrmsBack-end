package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import kodlamaio.Hrms.business.abstracts.JobSeekerService;

import kodlamaio.Hrms.core.utilities.results.DataResult;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.Hrms.entities.concretes.JobSeeker;


@Service
public class JobSeekerManager implements JobSeekerService{



	private JobSeekerDao jobSeekerDao;
	@Autowired
	public JobSeekerManager( JobSeekerDao jobSeekerDao) {
		super();
	
		this.jobSeekerDao =jobSeekerDao;
	}
	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"data listelendi");
	}
	@Override
	public Result add(JobSeeker jobseeker) {
		this.jobSeekerDao.save(jobseeker);
		return new SuccessResult("iş arayan eklendi");
	}
	@Override
	public DataResult<JobSeeker> getJobSeekerByNationalId(String nationalId) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.getBynationalId(nationalId));
	}

	


	


	
}


	

