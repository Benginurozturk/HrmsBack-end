package kodlamaio.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.Hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobAdvertisement;




@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController {

	private JobAdvertisementService jobAdversitementService;

	@Autowired
	public JobAdvertisementController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdversitementService = jobAdvertisementService;
	}

	
	@PostMapping("/add")
	public Result add(@RequestBody JobAdvertisement jobAdvertisement){
		return this.jobAdversitementService.add(jobAdvertisement);
	}
//	
//	@PostMapping("/update")
//	public Result update(@RequestBody JobAdvert jobAdvert){
//		return this.jobAdvertService.update(jobAdvert);
//	}
//	
//	@PostMapping("/delete")
//	public Result delete(@PathVariable("id") int id){
//		return this.jobAdvertService.delete(id);
//	}
//	
	@GetMapping("/getbyid")
	public DataResult<JobAdvertisement> getById(int id){
		return this.jobAdversitementService.getById(id);
	}
	
	@GetMapping("/getAll")
	public DataResult<List<JobAdvertisement>> getAll(){		
		return this.jobAdversitementService.getAll();
	}
	
	/*@PostMapping("/changeOpenToClose")
	public Result changeOpenToClose(int id){
		return this.jobAdversitementService.changeOpenToClose(id);
	}*/
	
	/*@GetMapping("/getAllOpenJobAdvertList")
	public DataResult<List<JobAdvertisement>> getAllOpenJobAdvertisementList(){
		return this.jobAdversitementService.getAllOpenJobAdvertList();
	}*/
	
	@GetMapping("/findAllByOrderByPublishedAt")
	public DataResult<List<JobAdvertisement>> findByIsOpenTrueOrderByDeadline (){
		return this.jobAdversitementService.findByIsOpenTrueOrderByDeadline ();
	}
	
	@GetMapping("/getAllOpenJobAdvertByEmployer")
	public DataResult<List<JobAdvertisement>> getByIsOpenJobAdvertisementOrderByEmployer_Id(@RequestParam int employer_id){
		return this.jobAdversitementService.getByIsOpenAndEmployer_Id(employer_id);
	}
}