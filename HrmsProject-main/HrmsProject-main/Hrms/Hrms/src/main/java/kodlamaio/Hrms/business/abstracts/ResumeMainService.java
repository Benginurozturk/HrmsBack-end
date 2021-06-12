package kodlamaio.Hrms.business.abstracts;
import java.util.List;


import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.ResumeMain;

public interface ResumeMainService {
	
	public Result add(ResumeMain  resumeMain);
	public DataResult<List<ResumeMain>> getAll();
	public DataResult<List<ResumeMain>> getAllSortedGradutionYear();
	public DataResult<List<ResumeMain>> getAllSortedExperinceYear();
	public DataResult<ResumeMain> getById(int userId);
}
