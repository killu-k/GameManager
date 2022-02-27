package valiit.game.result.service.game;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.competition.Competition;
import valiit.game.result.domain.competition.CompetitionRepository;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.game.GameRepository;
import valiit.game.result.domain.gameInCompetition.GameInCompetition;
import valiit.game.result.domain.gameInCompetition.GameInCompetitionService;
import valiit.game.result.domain.gameType.GameType;
import valiit.game.result.domain.gameType.GameTypeDto;
import valiit.game.result.domain.gameType.GameTypeRepository;
import valiit.game.result.domain.gameType.GameTypeService;
import valiit.game.result.domain.status.Status;
import valiit.game.result.domain.status.StatusRepository;
import valiit.game.result.domain.team.Team;
import valiit.game.result.domain.team.TeamRepository;
import valiit.game.result.domain.teamInGame.TeamInGame;
import valiit.game.result.domain.teamInGame.TeamInGameRepository;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static valiit.game.result.service.StatusValues.REGISTERED;

@Service
public class GameService {
    
    @Resource
    private StatusRepository statusRepository;
    @Resource
    private GameTypeRepository gameTypeRepository;
    @Resource
    private GameRepository gameRepository;
    @Resource
    private TeamInGameRepository teamInGameRepository;
    @Resource
    private TeamRepository teamRepository;
    @Resource
    private GameTypeService gameTypeService;
    @Resource
    private GameInCompetitionService gameInCompetitionService;
    @Resource
    private CompetitionRepository competitionRepository;

    public void addGame(AddNewGameRequest request) {

        Game game = new Game();
        game.setName(request.getGameName());
        Status status = statusRepository.findByName(REGISTERED);
        game.setStatus(status);
        game.setDate(LocalDate.now());
        GameType gameType = gameTypeRepository.findById(request.getGameTypeId()).get();
        game.setGameType(gameType);
        gameRepository.save(game);
        Competition competition = competitionRepository.findById(request.getCompetitionId()).get();
        GameInCompetition gameInCompetition = new GameInCompetition();
        gameInCompetition.setCompetition(competition);
        gameInCompetition.setGame(game);
        gameInCompetitionService.save(gameInCompetition);
    }

    public void addTeamToGame(AddTeamsToGameRequest request) {
        List<TeamInGame> teamsInGames = new ArrayList<>();
        for (Integer teamId : request.getTeamIds()) {
            TeamInGame teamInGame = new TeamInGame();
            Game gameById = gameRepository.findById(request.getGameId()).get();
            Team team = teamRepository.findById(teamId).get();
            teamInGame.setGame(gameById);
            teamInGame.setTeam(team);
            teamsInGames.add(teamInGame);
        }
        teamInGameRepository.saveAll(teamsInGames);
    }

    public Game findById(Integer gameId) {
        return gameRepository.findById(gameId).get();
    }

    public List<GameTypeDto> getAllGameTypes() {
        return gameTypeService.getAllGameTypes();
    }

    public Integer findGameTypeId(Integer gameId) {
        Game game = gameRepository.findById(gameId).get();
        return game.getGameType().getId();
    }
}
