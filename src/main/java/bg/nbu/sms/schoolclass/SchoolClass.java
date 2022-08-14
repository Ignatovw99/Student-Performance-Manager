package bg.nbu.sms.schoolclass;

import bg.nbu.sms.common.IdEntity;
import bg.nbu.sms.common.YearAttributeConverter;
import bg.nbu.sms.school.School;
import bg.nbu.sms.student.Student;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.time.Year;
import java.util.Set;

@Entity
@Table(
        name = "school_classes"
//        uniqueConstraints = {
//                @UniqueConstraint(columnNames = { "school", "classNumber", "year" })
//        }
)
@Data
@EqualsAndHashCode(callSuper = true)
public class SchoolClass extends IdEntity {

    @ManyToOne(optional = false)
    private School school;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ClassNumber classNumber;

    @Convert(converter = YearAttributeConverter.class)
    @Column(nullable = false)
    private Year year;

    @ManyToMany
    @JoinTable(
            name = "school_classes_students",
            joinColumns = @JoinColumn(name = "school_class_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "student_id", referencedColumnName = "id")
    )
    @EqualsAndHashCode.Exclude
    private Set<Student> students;

}
