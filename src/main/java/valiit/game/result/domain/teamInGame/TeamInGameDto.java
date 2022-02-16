package valiit.game.result.domain.teamInGame;

import lombok.Data;
import valiit.game.result.domain.game.GameDto;
import valiit.game.result.domain.team.TeamDto;

import java.io.Serializable;

@Data
public class TeamInGameDto implements Serializable {
    private final Integer id;
    private final GameDto game;
    private final TeamDto team;
}
