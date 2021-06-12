package kodlamaio.Hrms.entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

import javax.persistence.*;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employee_confirmations")
@Data
public class EmployeeConfirmation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @ManyToOne(targetEntity = Employee.class)
    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    private Employee employee;

    @Column(name = "is_confirmed")
    private boolean isConfirmed;
    
    @Column(name="confirm_date")
	private LocalDate confirmDate = LocalDate.now();
}
