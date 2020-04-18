package guru.springframework.sfgpetclinic.services;

import java.util.Set;

/**
 * Created by @author Kalmaasali on 18/04/2020.
 **/
public interface CrudService<T, ID> {

    T findById(ID id);

    T save(T object);

    Set<T> findAll();

    void delete(T object);

    void deleteById(ID id);
}
