package valiit.game.result.domain.teamInGame;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TeamInGameService {

    @Resource
    private TeamInGameRepository teamInGameRepository;

    public List<TeamInGame> findTeamsInGame(Integer gameId) {
         return teamInGameRepository.findByGameIdAsc(gameId);
    }

}
