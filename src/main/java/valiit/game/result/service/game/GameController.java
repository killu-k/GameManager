package valiit.game.result.service.game;

import org.springframework.web.bind.annotation.*;
import valiit.game.result.domain.team.TeamDto;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/game")
public class GameController {

    @Resource
    private GameService gameService;

    @PostMapping("/add/game")
    public void addGame(@RequestParam Integer gameTypeId, @RequestParam String gameName) {
        gameService.addGame(gameTypeId, gameName);
    }

    @PostMapping("/add/teams")
    public void addTeamToGame(@RequestBody NewGameRequest request) {
        gameService.addTeamToGame(request);
    }

}
