package kodlamaio.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.Hrms.business.abstracts.JobTypeService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.Hrms.dataAccess.abstracts.JobTypeDao;
import kodlamaio.Hrms.entities.concretes.JobType;

@Service
public class JobTypeManager implements JobTypeService {

    private final JobTypeDao repository;

    @Autowired
    public JobTypeManager(JobTypeDao repository) {
        this.repository = repository;
    }

    @Override
    public DataResult<List<JobType>> getAll() {
        var jobTypes = repository.findAll();
        return new SuccessDataResult<>(jobTypes);
    }

    @Override
    public boolean isExistById(int id) {
        return repository.existsById(id);
    }
}