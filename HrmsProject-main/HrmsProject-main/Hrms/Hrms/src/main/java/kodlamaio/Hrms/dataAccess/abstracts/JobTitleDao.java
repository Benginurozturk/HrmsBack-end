package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import kodlamaio.Hrms.entities.concretes.JobTitle;
@Repository
public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {

	boolean existsByJobTitle(String jobTitle); // burada sorguyu yazarken entity deki field isimlerini kullanman gerek.aynı böyle mi aynen öğrenmiş oldum
		
}
// mesela buralarda JobTitle içinde değil de dur göstereyim