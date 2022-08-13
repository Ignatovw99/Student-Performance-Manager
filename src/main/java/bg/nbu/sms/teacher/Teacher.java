package bg.nbu.sms.teacher;

import bg.nbu.sms.auth.entity.User;
import bg.nbu.sms.school.School;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "teachers")
@Data
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Teacher extends User {

    @ManyToOne
    private School school;
}
