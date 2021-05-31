package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobAdversitementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.ErrorResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobAdvertisementDao;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdversitementService {

	private JobAdvertisementDao jobAdvertisementDao;

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}

	@Override
	public Result add(JobAdvertisement jobAdvert) {
		if (!CheckIfNullField(jobAdvert)) {
			return new ErrorResult("You have entered missing information. Please fill in all fields.");
		}
		this.jobAdvertisementDao.save(jobAdvert);
		return new SuccessResult("Job advert has been added.");
	}

	@Override
	public Result update(JobAdvertisement jobAdvertisement) {
		this.jobAdvertisementDao.save(jobAdvertisement);
		return new SuccessResult("Job advertisement has been updated.");
	}

	@Override
	public Result delete(int id) {
		this.jobAdvertisementDao.deleteById(id);
		return new SuccessResult("Job advertisement has been deleted.");
	}

	@Override
	public DataResult<JobAdvertisement> getById(int id) {
		return new SuccessDataResult<JobAdvertisement>(this.jobAdvertisementDao.getById(id));
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll());
	}

	@Override
	public Result changeOpenToClose(int id) {
		if (getById(id) == null) {
			return new ErrorResult("There is no such job advertisement");

		}
		if (getById(id).getData().isOpen() == false) {
			return new ErrorResult("There job advertisement is already closed.");
		}

		JobAdvertisement jobAdvertisement = getById(id).getData();
		jobAdvertisement.setOpen(false);
		update(jobAdvertisement);
		return new SuccessResult("Job advertisement has been successfully closed.");
	}

	@Override
	public DataResult<List<JobAdvertisement>> getAllOpenJobAdvertList() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getAllOpenJobAdvertisementList());
	}

	@Override
	public DataResult<List<JobAdvertisement>> findByIsOpenTrueOrderByDeadline() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findByIsOpenTrueOrderByDeadline());
	}

	@Override
	public DataResult<List<JobAdvertisement>> getByIsOpenAndEmployer_Id( int employerId) {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsOpenAndEmployer_Id(true, employerId));
	}

	private boolean CheckIfNullField(JobAdvertisement jobAdvertisement) {
		if (jobAdvertisement.getJobPosition() != null && jobAdvertisement.getDescription() != null && jobAdvertisement.getCity() != null
				&& jobAdvertisement.getOpenPositionCount() != 0) {
			return true;
		}
		return false;
	}
}