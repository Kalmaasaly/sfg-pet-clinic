package guru.springframework.sfgpetclinic.model;

/**
 * Created by @author Kalmaasali on 28/04/2020.
 **/
public class Speciality extends BaseEntity {
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
