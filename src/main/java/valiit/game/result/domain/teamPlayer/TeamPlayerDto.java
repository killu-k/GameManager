package valiit.game.result.domain.teamPlayer;

import lombok.Data;
import valiit.game.result.domain.player.PlayerDto;
import valiit.game.result.domain.team.TeamDto;

import java.io.Serializable;

@Data
public class TeamPlayerDto implements Serializable {
    private final Integer id;
    private final TeamDto team;
    private final PlayerDto player;
}
