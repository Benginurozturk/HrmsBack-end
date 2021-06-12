package kodlamaio.Hrms.business.concretes;


import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobTitleService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobTitle;


@Service
public class JobTitleManager implements JobTitleService{

	@Override
	public DataResult<List<JobTitle>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(JobTitle newJobTitles) {
		// TODO Auto-generated method stub
		return null;
	}

}