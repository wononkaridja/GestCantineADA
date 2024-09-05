package ci.cantine.cantine.services.Impl;

import ci.cantine.cantine.models.Menu;
import ci.cantine.cantine.models.Plat;
import ci.cantine.cantine.repositories.PlatRepository;
import ci.cantine.cantine.services.PlatService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@RequiredArgsConstructor

public class PlatServiceImpl implements PlatService {
    private final PlatRepository platRepository;
    @Override
    public Plat save(Plat plat) {
        return platRepository.save(plat);
    }

    @Override
    public List<Plat> findAll() {
        return null;
    }

    @Override
    public Plat update(Plat plat) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        platRepository.deleteById(id);

    }

    @Override
    public Optional<Plat> findOne(Long id) {
        return platRepository.findById(id);
    }
}
