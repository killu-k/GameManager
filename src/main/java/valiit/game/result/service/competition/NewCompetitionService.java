package valiit.game.result.service.competition;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.competition.*;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.game.GameRepository;
import valiit.game.result.domain.gameInCompetition.GameInCompetition;
import valiit.game.result.domain.gameInCompetition.GameInCompetitionMapper;
import valiit.game.result.domain.gameInCompetition.GameInCompetitionRepository;
import valiit.game.result.domain.gameInCompetition.GameInCompetitionService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class NewCompetitionService {
    @Resource
    private CompetitionRepository competitionRepository;
    @Resource
    private GameInCompetitionRepository gameInCompetitionRepository;
    @Resource
    private GameRepository gameRepository;
    @Resource
    private GameInCompetitionService gameInCompetitionService;
    @Resource
    private GameInCompetitionMapper gameInCompetitionMapper;
    @Resource
    private CompetitionService competitionService;
    @Resource
    private CompetitionMapper competitionMapper;

    public CompetitionDto addCompetition(String competitionName) {
        Competition competition = new Competition();
        competition.setName(competitionName);
        competitionRepository.save(competition);
        CompetitionDto competitionDto = new CompetitionDto(competition.getId(), competitionName);
//        competitionDto.setName(competitionName);
//        competitionDto.setId(competition.getId());
        return competitionDto;
    }

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

    public List<NewCompetitionDto> findCompetitionGames(Integer competitionId) {
        List<GameInCompetition> competitionGames = gameInCompetitionService.findAllCompetitionGames(competitionId);
        return gameInCompetitionMapper.toDtos(competitionGames);
    }

    public List<CompetitionDto> findAllCompetitions() {
        List<Competition> competitions = competitionService.findAllCompetitions();
        return competitionMapper.toDto(competitions);
    }
}
