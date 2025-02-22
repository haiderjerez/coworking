package pro.coworking.Service;

import pro.coworking.Entity.Space;
import pro.coworking.Repository.SpaceRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class SpaceService {
    private final SpaceRepository spaceRepository;

    public SpaceService(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    public List<Space> getAllSpaces() {
        return spaceRepository.findAll();
    }
}