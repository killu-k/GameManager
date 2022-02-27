package valiit.game.result.domain.gameInCompetition;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.game.Game;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GameInCompetitionService {

    @Resource
    private GameInCompetitionRepository gameInCompetitionRepository;

    public void save(GameInCompetition gameInCompetition) {
        gameInCompetitionRepository.save(gameInCompetition);
    }

    public List<GameInCompetition> findAllCompetitionGames(Integer competitionId) {
        return gameInCompetitionRepository.findCompetitionGamesByCompetitionId(competitionId);
    }

    public GameInCompetition findByCompetitionId(Integer competitionId) {
        GameInCompetition byCompetitionId = gameInCompetitionRepository.findByCompetitionId(competitionId);
        return byCompetitionId;
    }

    public void deleteGameInCompetition(Integer gameInCompetitionId) {
        gameInCompetitionRepository.deleteGameByGameInCompetitionId(gameInCompetitionId);
    }

}
