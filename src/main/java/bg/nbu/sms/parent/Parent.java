package bg.nbu.sms.parent;

import bg.nbu.sms.auth.entity.User;
import bg.nbu.sms.student.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "parents")
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Parent extends User {

    @ManyToMany
    @JoinTable(
            name = "parents_students",
            joinColumns = @JoinColumn(name = "parent_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id")
    )
    private Set<Student> children;

}
