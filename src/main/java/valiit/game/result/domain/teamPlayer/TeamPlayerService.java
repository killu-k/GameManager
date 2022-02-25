package valiit.game.result.domain.teamPlayer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
import java.util.Optional;

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


    public TeamPlayer findById(Integer teamPlayerId) {
        TeamPlayer teamPlayer = teamPlayerRepository.findById(teamPlayerId).get();
        return teamPlayer;
    }

    public void delete(TeamPlayer teamPlayer) {
        teamPlayerRepository.delete(teamPlayer);
    }
}
