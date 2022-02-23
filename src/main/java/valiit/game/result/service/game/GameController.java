package valiit.game.result.service.game;

import org.springframework.web.bind.annotation.*;
import valiit.game.result.domain.gameType.GameTypeDto;
import valiit.game.result.domain.gameType.GameTypeService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Resource
    private GameService gameService;

    @Resource
    private GameTypeService gameTypeService;

    @PostMapping("/add/game")
    public void addGame(@RequestParam Integer gameTypeId, @RequestParam String gameName) {
        gameService.addGame(gameTypeId, gameName);
    }

    @PostMapping("/add/team/in/game")
    public void addTeamToGame(@RequestBody AddTeamsToGameRequest request) {
        gameService.addTeamToGame(request);
    }

    @GetMapping("/get/all/game/type")
    public List<GameTypeDto> getAllGameTypes() {
        return gameTypeService.getAllGameTypes();
    }
}
