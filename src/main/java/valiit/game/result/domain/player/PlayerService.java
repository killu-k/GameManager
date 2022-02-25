package valiit.game.result.domain.player;

import org.springframework.stereotype.Service;
import valiit.game.result.service.player.NewPlayerDto;

import javax.annotation.Resource;

@Service
public class PlayerService {

    @Resource
    private PlayerRepository playerRepository;

    public void save(Player player) {playerRepository.save(player);}
}
