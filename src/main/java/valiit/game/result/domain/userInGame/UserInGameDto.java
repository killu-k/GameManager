package valiit.game.result.domain.userInGame;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserInGameDto implements Serializable {
    private final String firstName;
    private final String lastName;
    private final String gameTypeName;
    private final String gameName;
}
