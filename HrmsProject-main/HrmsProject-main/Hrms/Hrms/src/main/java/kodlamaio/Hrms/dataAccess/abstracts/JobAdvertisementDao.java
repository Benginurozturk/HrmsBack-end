package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.Hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	@Query("From JobAdvertisement where isOpen = true")
	List<JobAdvertisement> getAllOpenJobAdvertisementList();
	
	List<JobAdvertisement> getByIsOpen(boolean isOpen); // bu isOpen yerine false gelince kapalı iş ilanlarını true gelirse açık iş ilanlarını listeler
	
	//@Query("From JobAdvert where isOpen = true Order By publishedAt Desc")
	List<JobAdvertisement>  getByIsOpenTrueOrderByDeadline(); // bu da sona erme tarihine göre sıralıyordu 
	
	//@Query("From JobAdvert where isOpen = true and employer_id =:id")
	List<JobAdvertisement> getByIsOpenAndEmployer_Id(boolean isOpen, int employerId);
	
	JobAdvertisement getById(int id);
}