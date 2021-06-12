package kodlamaio.Hrms.business.abstracts;
import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeLanguage;


public interface ResumeLanguageService {
	Result add(ResumeLanguage resumeLanguage);
	DataResult<List<ResumeLanguage>> getAll();
}
