package bg.nbu.sms.student;

import bg.nbu.sms.auth.entity.User;
import bg.nbu.sms.parent.Parent;
import bg.nbu.sms.school.School;
import bg.nbu.sms.schoolclass.SchoolClass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "students")
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Student extends User {

    @ManyToOne
    private School school;

    @ManyToMany(mappedBy = "children")
    private Set<Parent> parents;

    @ManyToMany(mappedBy = "students")
    private Set<SchoolClass> classes;

}
