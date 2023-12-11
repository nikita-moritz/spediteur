package spediteur.model.interfaces;

import java.util.List;

public interface CRUD<ENTITY> {

    List<ENTITY> findAll();

    ENTITY create(ENTITY entity);

    ENTITY update(ENTITY entity);

    void deleteById(String username);

}
