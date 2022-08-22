package bg.nbu.sms.school;

import bg.nbu.sms.common.IdEntity;
import bg.nbu.sms.teacher.Teacher;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;

@Entity
@Table(name = "schools")
@Data
@EqualsAndHashCode(callSuper = true)
public class School extends IdEntity {

    @Column(nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    @EqualsAndHashCode.Exclude
    private String address;

    @OneToOne
    @JoinColumn(unique = true)
    private Teacher principal;

}
