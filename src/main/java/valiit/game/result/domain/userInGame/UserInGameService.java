package valiit.game.result.domain.userInGame;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInGameService {

    @Resource
    private UserInGameRepository userInGameRepository;

    public void saveAll(List<UserInGame> usersInGames) {
        userInGameRepository.saveAll(usersInGames);
    }
}
