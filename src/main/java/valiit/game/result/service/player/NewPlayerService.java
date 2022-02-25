package valiit.game.result.service.player;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.player.Player;
import valiit.game.result.domain.player.PlayerMapper;
import valiit.game.result.domain.player.PlayerRepository;
import valiit.game.result.domain.player.PlayerService;
import valiit.game.result.domain.teamPlayer.TeamPlayer;
import valiit.game.result.domain.teamPlayer.TeamPlayerRepository;

import javax.annotation.Resource;

@Service
public class NewPlayerService {

    @Resource
    private TeamPlayerRepository teamPlayerRepository;
    @Resource
    private PlayerMapper playerMapper;
    @Resource
    private PlayerService playerService;

    public void updatePlayerInfo(NewPlayerDto playerDto, Integer teamPlayerId) {
        TeamPlayer teamPlayer = teamPlayerRepository.findById(teamPlayerId).get();
        Player player = teamPlayer.getPlayer();
        playerMapper.updatePlayerFromNewPlayerDto(playerDto, player);
        playerService.save(player);
    }
}
