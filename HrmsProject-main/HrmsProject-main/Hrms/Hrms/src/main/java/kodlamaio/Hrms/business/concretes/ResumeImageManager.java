package kodlamaio.Hrms.business.concretes;


import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import kodlamaio.Hrms.business.abstracts.ResumeImageService;
import kodlamaio.Hrms.core.imageManager.UploadService;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.core.utilities.results.SuccessResult;
import kodlamaio.Hrms.dataAccess.abstracts.ResumeImageDao;
import kodlamaio.Hrms.entities.concretes.ResumeImage;
import kodlamaio.Hrms.entities.concretes.ResumeMain;


@Service
public class ResumeImageManager implements ResumeImageService{

	private ResumeImageDao resumeImageDao;
	private UploadService uploadService;



	 @Autowired
	public ResumeImageManager(ResumeImageDao resumeImageDao, UploadService uploadService) {
		super();
		this.resumeImageDao = resumeImageDao;
		this.uploadService = uploadService;
	}





	
	@Override
	public Result uploadPhoto(MultipartFile file, int id) {
		
		ResumeImage resumeImage= new ResumeImage();
		ResumeMain resumeMain = new ResumeMain();
		
		    resumeImage.setResumeMain(resumeMain);
		    resumeMain.setId(id);
			@SuppressWarnings("unchecked")
			Map<String,String> result =(Map<String, String>) uploadService.upload(file).getData();
	        String url = result.get("urlAddress");
	        resumeImage.setUrlAddress(url);
	        
	        resumeImageDao.save(resumeImage);
	        return new SuccessResult("success");
	}





	@Override
	public Result delete(int id) {
		this.resumeImageDao.getByResumeMain_Id(id);
	    return new SuccessResult("image has been deleted.");
	}


	
	
	
}