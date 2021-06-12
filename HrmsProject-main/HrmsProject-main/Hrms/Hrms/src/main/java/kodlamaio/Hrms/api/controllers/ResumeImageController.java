package kodlamaio.Hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import kodlamaio.Hrms.business.abstracts.ResumeImageService;
import kodlamaio.Hrms.core.utilities.results.Result;

@RestController
@RequestMapping("api/resumeImage")
public class ResumeImageController {
	
	private ResumeImageService resumeImageService;	
	
	@Autowired
	public ResumeImageController(ResumeImageService resumeImageService) {
		super();
		this.resumeImageService = resumeImageService;
	}

	 @PostMapping("imageupload")
	    public ResponseEntity<?> uploadPhoto(@RequestParam("file") MultipartFile file, @RequestParam("id") int id){

	        return ResponseEntity.ok(resumeImageService.uploadPhoto(file,id));
	    }
	 
	 @PostMapping("/delete")
		public Result delete(@PathVariable("id") int id){
		return this.resumeImageService.delete(id);
		}
}
