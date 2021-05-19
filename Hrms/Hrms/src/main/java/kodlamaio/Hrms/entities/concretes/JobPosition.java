package kodlamaio.Hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job_positions")
@Data
public class JobPosition {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "position_name")
    private String tposition_name;


}