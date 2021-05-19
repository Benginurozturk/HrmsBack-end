package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.entities.concretes.JobPosition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobPositionService;

@RestController
@RequestMapping("/api/job-positions")
public class JobPositionsController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/get-all")
    public List<JobPosition> getAll(){
        return this.jobPositionService.getAll();
    }
}