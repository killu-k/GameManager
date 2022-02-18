package valiit.game.result.service.game;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.game.GameRepository;
import valiit.game.result.domain.gameType.GameType;
import valiit.game.result.domain.gameType.GameTypeRepository;
import valiit.game.result.domain.status.Status;
import valiit.game.result.domain.status.StatusRepository;
import valiit.game.result.domain.team.Team;
import valiit.game.result.domain.team.TeamMapper;
import valiit.game.result.domain.team.TeamRepository;
import valiit.game.result.domain.teamInGame.TeamInGame;
import valiit.game.result.domain.teamInGame.TeamInGameRepository;

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
    @Resource
    private TeamInGameRepository teamInGameRepository;
    @Resource
    private TeamMapper teamMapper;
    @Resource
    private TeamRepository teamRepository;

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

    public void addTeamToGame(NewGameRequest request) {
        List<Team> teamIds = teamMapper.teamDtosToTeams(request.getTeamIds());
        List<TeamInGame> teamsInGames = new ArrayList<>();
        for (Team teamId : teamIds) {
            TeamInGame teamInGame = new TeamInGame();
            Game gameById = gameRepository.findById(request.getGameId()).get();
            teamInGame.setGame(gameById);
            teamInGame.setTeam(teamId);
            teamsInGames.add(teamInGame);
        }
        teamInGameRepository.saveAll(teamsInGames);
    }
}