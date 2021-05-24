package kodlamaio.Hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
@Data
public class JobPosition {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;



    @Column(name = "title")
    private String title;
}
