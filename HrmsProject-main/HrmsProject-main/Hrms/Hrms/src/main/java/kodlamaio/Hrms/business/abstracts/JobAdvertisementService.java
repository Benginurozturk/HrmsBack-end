package kodlamaio.Hrms.business.abstracts;




import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;



public interface JobAdvertisementService {

	Result add(JobAdvertisement jobAdvertisement);
	Result update(JobAdvertisement jobAdversitement);
	Result delete(JobAdvertisement jobAdversitement);
//	Result changeOpenToClose(int id);
	DataResult<JobAdvertisement> getById(int id);	
	DataResult<List<JobAdvertisement>> getAll();
	DataResult<List<JobAdvertisement>> getAllSortDesc(String fieldName);
	DataResult<List<JobAdvertisement>> getAllSortAsc(String fieldName);
	
	DataResult<List<JobAdvertisement>> getAllOpenJobAdvertList(boolean isOpen);
	DataResult<List<JobAdvertisement>> findByIsOpenTrueOrderByDeadline();
	DataResult<List<JobAdvertisement>> getByIsOpenAndEmployer_Id( int employerId);
	
} 

// 