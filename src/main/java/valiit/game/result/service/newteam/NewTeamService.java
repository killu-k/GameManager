package valiit.game.result.service.newteam;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.player.Player;
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

        Team team = new Team();
        TeamPlayer teamPlayer = new TeamPlayer();
        teamPlayer.setTeam(team);
        teamPlayer.setPlayer(player);
        teamPlayerService.save(team);
    }

    public List<NewTeamPlayerDto> findTeamPlayers(Integer teamId) {
        List<TeamPlayer> teamPlayers = teamPlayerService.findAllTeamPlayers(teamId);
        return teamPlayerMapper.toDtos(teamPlayers);


    }
}

