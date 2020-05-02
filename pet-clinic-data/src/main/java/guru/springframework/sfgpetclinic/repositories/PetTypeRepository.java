package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author Kalmaasali on 03/05/2020.
 **/
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
