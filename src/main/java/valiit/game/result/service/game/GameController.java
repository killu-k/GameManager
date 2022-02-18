package valiit.game.result.service.game;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/game")
public class GameController {

    @Resource
    private GameService gameService;

    @PostMapping("/add")
    public void addGame(@RequestParam Integer gameTypeId, @RequestParam String gameName) {

        gameService.addGame(gameTypeId, gameName);

    }

}
