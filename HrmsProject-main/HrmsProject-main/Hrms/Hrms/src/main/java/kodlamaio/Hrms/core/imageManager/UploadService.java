package kodlamaio.Hrms.core.imageManager;

import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import kodlamaio.Hrms.core.utilities.results.DataResult;

public interface UploadService {
	 @SuppressWarnings("rawtypes")
	DataResult<Map> upload(MultipartFile multiPartfile);
}
// 