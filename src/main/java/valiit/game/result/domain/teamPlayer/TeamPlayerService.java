package valiit.game.result.domain.teamPlayer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamPlayerService {

    @Resource
    private TeamPlayerRepository teamPlayerRepository;

    public void save(TeamPlayer teamPlayer) {
        teamPlayerRepository.save(teamPlayer);
    }

    public List<TeamPlayer> findAllTeamPlayers(Integer teamId) {
        return teamPlayerRepository.findTeamPlayersByTeamIdOrderById(teamId);
    }
}
