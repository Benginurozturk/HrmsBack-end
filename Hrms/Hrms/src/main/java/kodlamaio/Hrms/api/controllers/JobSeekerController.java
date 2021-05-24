package kodlamaio.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import kodlamaio.Hrms.business.abstracts.JobSeekerService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobSeeker;

@RestController
@RequestMapping("/api/employees")
public class JobSeekerController {

	private JobSeekerService employeeService;

	@Autowired
	public JobSeekerController(JobSeekerService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	

//	@PostMapping("/add")
//	public Result add(@RequestBody Employee employee){
//		return this.employeeService.add(employee);
//	}
//	
//	@PostMapping("/update")
//	public Result update(@RequestBody Employee employee){
//		return this.employeeService.update(employee);
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id){
//		return this.employeeService.delete(id);
//	}
//	

	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.employeeService.getAll();
	}
}