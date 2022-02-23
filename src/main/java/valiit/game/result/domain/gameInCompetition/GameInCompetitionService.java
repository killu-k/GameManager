package valiit.game.result.domain.gameInCompetition;

import org.springframework.stereotype.Service;

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
}
