package ci.cantine.cantine.services;

import ci.cantine.cantine.models.Menu;

import java.util.List;
import java.util.Optional;

public interface MenuService {
    Menu save (Menu menu);
    List<Menu> findAll();
    Menu update (Menu menu);
    void deleteById(Long id);

    Optional<Menu> findOne(Long id);


}
