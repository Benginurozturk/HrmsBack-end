package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobTypeService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.JobType;

@RestController
@RequestMapping("/api/job-types")
public class JobTypesController {

    private final JobTypeService jobTypeService;

    @Autowired
    public JobTypesController(JobTypeService jobTypeService) {
        this.jobTypeService = jobTypeService;
    }

    @GetMapping
    public DataResult<List<JobType>> getAll() {
        return jobTypeService.getAll();
    }
}