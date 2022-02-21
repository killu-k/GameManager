package valiit.game.result.domain.userInGame;

import lombok.Data;
import valiit.game.result.domain.gameType.GameTypeDto;
import valiit.game.result.domain.status.StatusDto;
import valiit.game.result.domain.user.UserDto;
import valiit.game.result.domain.game.GameDto;

import java.io.Serializable;

@Data
public class UserInGameDto implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String gameTypeName;
    private final String gameName;
}
