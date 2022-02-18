package valiit.game.result.service.team;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.player.Player;
import valiit.game.result.domain.player.PlayerMapper;
import valiit.game.result.domain.player.PlayerRepository;
import valiit.game.result.domain.status.Status;
import valiit.game.result.domain.status.StatusRepository;
import valiit.game.result.domain.team.Team;
import valiit.game.result.domain.team.TeamRepository;
import valiit.game.result.domain.teamPlayer.TeamPlayer;
import valiit.game.result.domain.teamPlayer.TeamPlayerRepository;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class TeamService {

    @Resource
    private TeamRepository teamRepository;
    @Resource
    private PlayerRepository playerRepository;
    @Resource
    private PlayerMapper playerMapper;
    @Resource
    private StatusRepository statusRepository;
    @Resource
    private TeamPlayerRepository teamPlayerRepository;


    public void addTeam(NewTeamRequest request) {

        Status status = statusRepository.findByName("registered");

        Team team = new Team();
        team.setName(request.getTeamName());
        team.setStatus(status);
        teamRepository.save(team);

        List<Player> players = playerMapper.playerDtosToPlayers(request.getPlayers());
        playerRepository.saveAll(players);

        List<TeamPlayer> teamPlayers = new ArrayList<>();
        for (Player player : players) {
            TeamPlayer teamPlayer = new TeamPlayer();
            teamPlayer.setTeam(team);
            teamPlayer.setPlayer(player);
            teamPlayers.add(teamPlayer);
        }

        teamPlayerRepository.saveAll(teamPlayers);


        BigDecimal ageSum = BigDecimal.valueOf(0);
        BigDecimal age = BigDecimal.valueOf(0);
        BigDecimal increment = BigDecimal.valueOf(1);
        BigDecimal newCount = BigDecimal.valueOf(0);

        List<Player> playerAges = new ArrayList<>();
        for (Player playerAge : players) {
            Player playersAge = new Player();
            age = playerAge.getAge();
            playersAge.setAge(age);
            playerAges.add(playerAge);
            ageSum = ageSum.add(age);
            newCount = newCount.add(increment);

        }

        BigDecimal averageAge = ageSum.divide(newCount);
        team.setAverageAge(averageAge);
        teamRepository.save(team);


    }
}

