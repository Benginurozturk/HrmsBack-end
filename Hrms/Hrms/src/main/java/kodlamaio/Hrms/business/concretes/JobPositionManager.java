package kodlamaio.Hrms.business.concretes;
import kodlamaio.Hrms.entities.concretes.JobPosition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.dataAccess.abstracts.JobPositionDao;

@Service
public class JobPositionManager implements JobPositionService {

    private JobPositionDao jobPositionDao;

    @Autowired
    public JobPositionManager(JobPositionDao jobPositionDao) {
        this.jobPositionDao = jobPositionDao;
    }

    @Override
    public List<JobPosition> getAll() {
        return this.jobPositionDao.findAll();
    }
}