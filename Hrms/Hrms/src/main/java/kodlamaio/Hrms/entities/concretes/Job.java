package kodlamaio.Hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "job")
@Data
public class Job extends User{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "user_id")
    private String userid;

    @Column(name = "title")
    private String title;
}
