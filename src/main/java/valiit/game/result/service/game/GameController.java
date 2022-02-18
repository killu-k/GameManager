package valiit.game.result.service.game;

import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/game")
public class GameController {

    @Resource
    private GameService gameService;

    @PostMapping("/add/game")
    public void addGame(@RequestParam Integer gameTypeId, @RequestParam String gameName) {
        gameService.addGame(gameTypeId, gameName);
    }

    @PostMapping("/add/team/in/game")
    public void addTeamToGame(@RequestBody AddTeamsToGameRequest request) {
        gameService.addTeamToGame(request);
    }

}
