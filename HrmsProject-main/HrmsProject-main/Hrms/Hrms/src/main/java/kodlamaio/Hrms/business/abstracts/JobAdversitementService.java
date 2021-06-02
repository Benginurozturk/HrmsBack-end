package kodlamaio.Hrms.business.abstracts;




import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;


public interface JobAdversitementService {

	Result add(JobAdvertisement jobAdversitement);
	Result update(JobAdvertisement jobAdversitement);
	Result delete(int id);
	Result changeOpenToClose(int id);
	DataResult<JobAdvertisement> getById(int id);	
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllOpenJobAdvertList();
	DataResult<List<JobAdvertisement>> findByIsOpenTrueOrderByDeadline();
	DataResult<List<JobAdvertisement>> getByIsOpenAndEmployer_Id( int employerId);
}