package bg.nbu.sms.student;

import bg.nbu.sms.auth.entity.User;
import bg.nbu.sms.common.IdEntity;
import bg.nbu.sms.parent.Parent;
import bg.nbu.sms.school.School;
import bg.nbu.sms.school.SchoolClass;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "students")
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Student extends User {

    @ManyToOne
    private School school;

    @Enumerated(EnumType.STRING)
    private SchoolClass schoolClass;

    @ManyToMany(mappedBy = "children")
    private Set<Parent> parents;

}
