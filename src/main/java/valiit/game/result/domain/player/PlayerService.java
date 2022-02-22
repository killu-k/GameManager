package valiit.game.result.domain.player;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PlayerService {

    @Resource
    private PlayerRepository playerRepository;

    public void save(Player player) {
        playerRepository.save(player);
    }
}
