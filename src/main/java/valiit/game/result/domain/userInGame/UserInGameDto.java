package valiit.game.result.domain.userInGame;

import lombok.Data;
import valiit.game.result.domain.user.UserDto;
import valiit.game.result.domain.game.GameDto;

import java.io.Serializable;

@Data
public class UserInGameDto implements Serializable {
    private final Integer id;
    private final UserDto user;
    private final GameDto game;
}
