package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;

import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;


@Service
public class JobAdvertisementManager implements JobAdvertisementService {

	private JobAdvertisementDao jobAdvertisementDao;

	
	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	

	@Override
	public Result delete(JobAdvertisement jobAdversitement) {
		this.jobAdvertisementDao.delete(jobAdversitement);
		return new SuccessResult("Silme işlemi Tamamlandı");
	}

/*	@Override
	public Result changeOpenToClose(int id) { 
		if (getById(id) == null) {
			return new ErrorResult("There is no such job advert");

		}
		if (getById(id).getData().isOpen() == false) {
			return new ErrorResult("There job advert is already closed.");
		}

		JobAdvertisement jobAdvertisement = getById(id).getData(); 
		jobAdvertisement.setOpen(false);
		update(jobAdvertisementDto);
		return new SuccessResult("Job advert has been successfully closed."); 	} 
 */
	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.getById(id));
	}  

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllOpenJobAdvertList(boolean isOpen) { 
		if(isOpen) {
			return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsOpen(true), 
					"Aktif iş ilanları listelendi.");
		} // 	
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsOpen(false), 
				"Pasif iş ilanları listelendi.");
	}

//	private boolean CheckIfNullField(JobAdvertisement jobAdvert) {
//		if (jobAdvert.get() != null && jobAdvert.getDescription() != null && jobAdvert.getCity() != null
//				&& jobAdvert.getOpenTitleCount() != 0) {
//			return true;
//		}
//		return false;
//	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsOpenTrueOrderByDeadline() {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsOpenTrueOrderByDeadline());
		
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsOpenAndEmployer_Id(int employerId) {
		// TODO Auto-generated method stub
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsOpenAndEmployer_Id(true, employerId), "İşverene ait aktif iş ilanları listelendi.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortDesc(String fieldName) {
		Sort sort = Sort.by(Sort.Direction.DESC, fieldName);
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort), fieldName + " yeniden eskiye/büyükten küçüğe listelendi.");
	} //

	@Override
	public DataResult<List<JobAdvertisement>> getAllSortAsc(String fieldName) {
		Sort sort = Sort.by(Sort.Direction.ASC, fieldName);
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(sort));
	}



	@Override
	public Result add(JobAdvertisement jobAdvertisement) {
		// TODO Auto-generated method stub
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("iiş ilanı eklendi");
	}



	@Override
	public Result update(JobAdvertisement jobAdversitement) {
		// TODO Auto-generated method stub
		this.jobAdvertisementDao.save(jobAdversitement);
		return new SuccessResult("güncellendi");
	}
	
}