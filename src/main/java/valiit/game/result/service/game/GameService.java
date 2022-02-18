package valiit.game.result.service.game;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.game.GameRepository;
import valiit.game.result.domain.gameType.GameType;
import valiit.game.result.domain.gameType.GameTypeRepository;
import valiit.game.result.domain.status.Status;
import valiit.game.result.domain.status.StatusRepository;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Resource
    private StatusRepository statusRepository;
    @Resource
    private GameTypeRepository gameTypeRepository;
    @Resource
    private GameRepository gameRepository;

    public void addGame(Integer gameTypeId, String gameName) {
        Game game = new Game();
        game.setName(gameName);
        Status status = statusRepository.findByName("registered");
        game.setStatus(status);
        game.setDate(LocalDate.now());

        GameType gameType = gameTypeRepository.findById(gameTypeId).get();
        game.setGameType(gameType);

        gameRepository.save(game);




    }
}
