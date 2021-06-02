package kodlamaio.Hrms.entities.concretes;


import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "jobs")
@Data
@EqualsAndHashCode(callSuper=false)
@PrimaryKeyJoinColumn(name="id")
public class Job extends User{
    

    @Column(name = "user_id")
    private String userid;

    @Column(name = "title")
    private String title;
}
