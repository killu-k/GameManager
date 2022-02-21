package valiit.game.result.service.user;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import valiit.game.result.domain.userInGame.UserInGameDto;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserGameService userGameService;

    @PostMapping("/add/game")
    public List<UserInGameDto> addAllGamesToUserById(@RequestBody AddGamesToUserRequest request) {
        return userGameService.addUserToGame(request);
    }
}
