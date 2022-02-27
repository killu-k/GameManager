package valiit.game.result.service.newteam;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.player.Player;
import valiit.game.result.domain.player.PlayerDto;
import valiit.game.result.domain.player.PlayerMapper;
import valiit.game.result.domain.player.PlayerService;
import valiit.game.result.domain.status.Status;
import valiit.game.result.domain.status.StatusService;
import valiit.game.result.domain.team.Team;
import valiit.game.result.domain.team.TeamService;
import valiit.game.result.domain.teamPlayer.TeamPlayer;
import valiit.game.result.domain.teamPlayer.TeamPlayerMapper;
import valiit.game.result.domain.teamPlayer.TeamPlayerService;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static valiit.game.result.service.StatusValues.REGISTERED;

@Service
public class NewTeamService {

    @Resource
    private StatusService statusService;

    @Resource
    private TeamService teamService;

    @Resource
    private TeamPlayerService teamPlayerService;

    @Resource
    private PlayerService playerService;

    @Resource
    private PlayerMapper playerMapper;

    @Resource
    private TeamPlayerMapper teamPlayerMapper;

    public NewTeamResponse addNewTeam(String teamName) {
        Team team = new Team();
        Status status = statusService.findByName(REGISTERED);
        team.setName(teamName);
        team.setStatus(status);
        teamService.save(team);
        NewTeamResponse response = new NewTeamResponse();
        response.setTeamId(team.getId());
        return response;
    }

    public void addNewPlayerToTeam(NewTeamPlayerRequest request) {
        Player player = playerMapper.toEntity(request.getPlayer());
        playerService.save(player);
        Team team = teamService.findTeam(request.getTeamId());
        TeamPlayer teamPlayer = new TeamPlayer();
        teamPlayer.setTeam(team);
        teamPlayer.setPlayer(player);
        teamPlayerService.save(teamPlayer);

        ArrayList<Player> players = new ArrayList<>();
        List<TeamPlayer> allTeamPlayers = teamPlayerService.findAllTeamPlayers(team.getId());
        for (TeamPlayer teamPlayer1 : allTeamPlayers) {
            Player player1 = teamPlayer1.getPlayer();
            players.add(player1);
        }
        Integer ageSum = 0;
        Integer count = 0;
        for (Player player1 : players) {
            Integer age = player1.getAge();
            ageSum += age;
            count++;
        } BigDecimal averageAge = BigDecimal.valueOf(ageSum / count);
        team.setAverageAge(averageAge);
        teamService.save(team);
    }

    public List<NewTeamPlayerDto> findTeamPlayers(Integer teamId) {
        List<TeamPlayer> teamPlayers = teamPlayerService.findAllTeamPlayers(teamId);
        return teamPlayerMapper.toDtos(teamPlayers);
    }
}

