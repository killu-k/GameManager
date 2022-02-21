package valiit.game.result.service.user;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.user.User;
import valiit.game.result.domain.user.UserService;
import valiit.game.result.domain.userInGame.UserInGame;
import valiit.game.result.domain.userInGame.UserInGameDto;
import valiit.game.result.domain.userInGame.UserInGameMapper;
import valiit.game.result.domain.userInGame.UserInGameService;
import valiit.game.result.service.game.GameService;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserGameService {
    @Resource
    private UserService userService;

    @Resource
    private GameService gameService;

    @Resource
    private UserInGameService userInGameService;

    @Resource
    private UserInGameMapper userInGameMapper;


    public List<UserInGameDto> addUserToGame(AddGamesToUserRequest request) {
        List<UserInGame> usersInGames = new ArrayList<>();
        for (Integer gameId : request.getGameIds()) {
            UserInGame userInGame = new UserInGame();
            Game gameById = gameService.findById(gameId);
            User user = userService.findById(request.getUserId());
            userInGame.setGame(gameById);
            userInGame.setUser(user);
            usersInGames.add(userInGame);
        }
        userInGameService.saveAll(usersInGames);
        return userInGameMapper.toDtos(usersInGames);
    }
}
