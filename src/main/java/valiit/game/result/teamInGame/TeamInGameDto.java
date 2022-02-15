package valiit.game.result.teamInGame;

import lombok.Data;
import valiit.game.result.game.GameDto;
import valiit.game.result.team.TeamDto;

import java.io.Serializable;

@Data
public class TeamInGameDto implements Serializable {
    private final Integer id;
    private final GameDto game;
    private final TeamDto team;
}
