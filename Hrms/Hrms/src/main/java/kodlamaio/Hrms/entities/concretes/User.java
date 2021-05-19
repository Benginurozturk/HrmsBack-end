package kodlamaio.Hrms.entities.concretes;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class User {	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	
	public User() {
    }

    public User(int id, String email, String password) {
        this.id = id;
        this.email = email;
        this.password = password;
        
    }
}