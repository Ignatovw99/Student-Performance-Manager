package bg.nbu.sms.school;

import bg.nbu.sms.common.IdEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

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
}
