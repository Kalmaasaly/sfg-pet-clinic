package guru.springframework.sfgpetclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by @author Kalmaasali on 28/04/2020.
 **/
@Entity
@Table(name = "specialities")
public class Speciality extends BaseEntity {
    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
