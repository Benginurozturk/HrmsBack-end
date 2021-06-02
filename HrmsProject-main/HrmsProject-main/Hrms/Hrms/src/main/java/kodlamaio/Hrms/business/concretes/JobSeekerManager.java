package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
//import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
//import kodlamaio.Hrms.core.utilities.results.SuccessResult;


import kodlamaio.Hrms.dataAccess.abstracts.JobSeekerDao;
import kodlamaio.Hrms.entities.concretes.JobSeeker;


@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao employeeDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao employeeDao) {
		super();
		this.employeeDao = employeeDao;
	}

//	@Override
	//public Result add(Employee employee) {
		//this.employeeDao.save(employee);
     //return new SuccessResult("Employee has been added.");		
	//}
//
//	@Override
//	public Result update(Employee employee) {
//		this.employeeDao.save(employee);
//      return new SuccessResult("Employee has been updated.");
//	}
//
//	@Override
//	public Result delete(int id) {
//		this.employeeDao.deleteById(id);
//      return new SuccessResult("Employee has been deleted.");
//	}
//


	@Override
	public DataResult<List<JobSeeker>> getAll() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobSeeker>>(this.employeeDao.findAll());
	}

}