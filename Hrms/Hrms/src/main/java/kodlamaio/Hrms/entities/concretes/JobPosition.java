package kodlamaio.Hrms.entities.concretes;

import lombok.Data;

import java.util.List;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "job_positions")
@Data
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "jobAdvertisement"})
public class JobPosition {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;



    @Column(name = "title")
    private String title;
    
    @OneToMany(mappedBy = "jobPosition")
    private List<JobAdvertisement> jobAdvertisement;
}
