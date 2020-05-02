package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by @author Kalmaasali on 03/05/2020.
 **/
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
