package valiit.game.result.domain.team;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TeamService {

    @Resource
    private TeamRepository teamRepository;

    public void save(Team team) {
        teamRepository.save(team);
    }

    public Team findTeam(Integer teamId) {
        return teamRepository.findById(teamId).get();
    }
}
