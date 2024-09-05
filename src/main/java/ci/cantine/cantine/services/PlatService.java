package ci.cantine.cantine.services;

import ci.cantine.cantine.models.Menu;
import ci.cantine.cantine.models.Plat;

import java.util.List;
import java.util.Optional;

public interface PlatService {

    Plat save(Plat plat);
    List<Plat> findAll();

    Plat update(Plat plat);

    void deleteById(Long id);

    Optional<Menu> findOne(Long id);
}
