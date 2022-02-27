package valiit.game.result.service.player;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.player.Player;
import valiit.game.result.domain.player.PlayerMapper;
import valiit.game.result.domain.player.PlayerRepository;
import valiit.game.result.domain.player.PlayerService;
import valiit.game.result.domain.teamPlayer.TeamPlayer;
import valiit.game.result.domain.teamPlayer.TeamPlayerRepository;
import valiit.game.result.domain.teamPlayer.TeamPlayerService;

import javax.annotation.Resource;

@Service
public class NewPlayerService {

    @Resource
    private TeamPlayerRepository teamPlayerRepository;
    @Resource
    private PlayerMapper playerMapper;
    @Resource
    private PlayerService playerService;
    @Resource
    private TeamPlayerService teamPlayerService;


    public void updatePlayerInfo(NewPlayerDto playerDto, Integer teamPlayerId) {
        TeamPlayer teamPlayer = teamPlayerRepository.findById(teamPlayerId).get();
        Player player = teamPlayer.getPlayer();
        playerMapper.updatePlayerFromNewPlayerDto(playerDto, player);
        playerService.save(player);
    }

    public void deletePlayer(Integer teamPlayerId) {
        TeamPlayer teamPlayer = teamPlayerService.findById(teamPlayerId);
        Player player = teamPlayer.getPlayer();
        playerService.delete(player);
    }
}
