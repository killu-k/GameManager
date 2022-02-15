package valiit.game.result.teamPlayer;

import lombok.Data;
import valiit.game.result.player.PlayerDto;
import valiit.game.result.team.TeamDto;

import java.io.Serializable;

@Data
public class TeamPlayerDto implements Serializable {
    private final Integer id;
    private final TeamDto team;
    private final PlayerDto player;
}
