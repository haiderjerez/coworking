package pro.coworking.Controller;

import pro.coworking.Entity.Space;
import pro.coworking.Service.SpaceService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/spaces")
public class SpaceController {
    private final SpaceService spaceService;

    public SpaceController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @GetMapping
    public List<Space> getAllSpaces() {
        return spaceService.getAllSpaces();
    }
}