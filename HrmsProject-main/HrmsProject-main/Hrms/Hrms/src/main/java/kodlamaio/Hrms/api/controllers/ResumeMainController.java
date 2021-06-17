package kodlamaio.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



import kodlamaio.Hrms.business.abstracts.ResumeMainService;
import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeMain;


@RestController
@RequestMapping(value= "api/resumeMains")
public class ResumeMainController {
	
	private ResumeMainService resumeMainService;
    
	@Autowired
	public ResumeMainController(ResumeMainService resumeMainService) {
		super();
		this.resumeMainService = resumeMainService;
	}
	
	@GetMapping("/getAllSortedGradutionYear")
	public DataResult<List<ResumeMain>> getAllSortedGradutionYear() {
		
		return this.resumeMainService.getAllSortedGradutionYear();
	}
	
	@GetMapping("/getAllSortedExperinceYear")
	public DataResult<List<ResumeMain>> getAllSortedExperinceYear() {
		
		return this.resumeMainService.getAllSortedExperinceYear();
	}
	
	@PostMapping("/getByCvId")
	public DataResult<ResumeMain> getByCvId(int cvId) {
		
		return this.resumeMainService.getById(cvId);
		
	}
	
	@PostMapping("/CvAdd")
	public Result add(@RequestBody ResumeMain resumeMain) {
		
		return this.resumeMainService.add(resumeMain);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<ResumeMain>> getAll() {
		return this.resumeMainService.getAll();
	}
	
	
	
}

