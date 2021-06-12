package kodlamaio.Hrms.business.abstracts;

import org.springframework.web.multipart.MultipartFile;



import kodlamaio.Hrms.core.utilities.results.Result;


public interface ResumeImageService {

   Result uploadPhoto(MultipartFile file,int id);

   Result delete(int id);


  
}
