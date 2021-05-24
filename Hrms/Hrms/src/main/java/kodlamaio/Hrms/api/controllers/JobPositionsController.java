package kodlamaio.Hrms.api.controllers;

import kodlamaio.Hrms.entities.concretes.JobPosition;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobPositionService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;

@RestController
@RequestMapping("/api/job-positions")
public class JobPositionsController {

    private JobPositionService jobPositionService;

    @Autowired
    public JobPositionsController(JobPositionService jobPositionService) {
        this.jobPositionService = jobPositionService;
    }

    @GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll(){
		return this.jobPositionService.getAll();
    }
    
    @PostMapping("/add")
	public Result add(@RequestBody JobPosition jobPosition){
		return this.jobPositionService.add(jobPosition);
	}
    
   /* @PostMapping("/update")
	public Result update(@RequestBody JobPosition jobPosition){
		return this.jobPositionService.update(jobPosition);
	}
	
	@PostMapping("/delete")
	public Result delete(@PathVariable("id") int id){
		return this.jobPositionService.delete(id);
	}*/
}