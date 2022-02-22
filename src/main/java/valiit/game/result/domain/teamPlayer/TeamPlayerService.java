package valiit.game.result.domain.teamPlayer;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.team.Team;
import valiit.game.result.domain.team.TeamRepository;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamPlayerService {
    @Resource
    private TeamRepository teamRepository;

    @Resource
    private TeamPlayerRepository teamPlayerRepository;

    public void save(Team team) {
        teamRepository.save(team);
    }

    public List<TeamPlayer> findAllTeamPlayers(Integer teamId) {
        return teamPlayerRepository.findTeamPlayersByTeamIdOrderById(teamId);
    }
}
