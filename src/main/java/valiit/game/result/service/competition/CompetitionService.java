package valiit.game.result.service.competition;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.competition.Competition;
import valiit.game.result.domain.competition.CompetitionRepository;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.game.GameMapper;
import valiit.game.result.domain.game.GameRepository;
import valiit.game.result.domain.gameInCompetition.GameInCompetition;
import valiit.game.result.domain.gameInCompetition.GameInCompetitionRepository;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class CompetitionService {
    @Resource
    private CompetitionRepository competitionRepository;
    @Resource
    private GameInCompetitionRepository gameInCompetitionRepository;
    @Resource
    private GameRepository gameRepository;

    public void addCompetition(String competitionName) {
        Competition competition = new Competition();
        competition.setName(competitionName);
        competitionRepository.save(competition);
    }
// Andmebaasist game_in_competition tabelist kustuta NAME


    public void addGameToCompetition(AddGamesToCompetitionRequest request) {
        List<GameInCompetition> gamesInCompetitions = new ArrayList<>();
        for (Integer gameId : request.getGameIds()) {
            GameInCompetition gameInCompetition = new GameInCompetition();
            Competition competitionById = competitionRepository.findById(request.getCompetitionId()).get();
            Game game = gameRepository.findById(gameId).get();
            gameInCompetition.setCompetition(competitionById);
            gameInCompetition.setGame(game);
            gamesInCompetitions.add(gameInCompetition);
        }
        gameInCompetitionRepository.saveAll(gamesInCompetitions);
    }
}
