package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	@Query("From JobAdvertisement where isOpen = true")
	List<JobAdvertisement> getAllOpenJobAdvertisementList();
	
	//@Query("From JobAdvert where isOpen = true Order By publishedAt Desc")
	List<JobAdvertisement>  findByIsOpenTrueOrderByDeadline(); 
	
	//@Query("From JobAdvert where isOpen = true and employer_id =:id")
	List<JobAdvertisement> getByIsOpenAndEmployer_Id(boolean isOpen, int employerId);
	
	JobAdvertisement getById(int id);
}