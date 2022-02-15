package valiit.game.result.userInGame;

import lombok.Data;
import valiit.game.result.game.GameDto;
import valiit.game.result.user.UserDto;

import java.io.Serializable;

@Data
public class UserInGameDto implements Serializable {
    private final Integer id;
    private final UserDto user;
    private final GameDto game;
}
