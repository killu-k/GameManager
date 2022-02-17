package valiit.game.result.domain.teamPlayer;

import lombok.Data;
import valiit.game.result.domain.player.Player;
import valiit.game.result.domain.team.Team;

import java.io.Serializable;
import java.util.List;

@Data
public class TeamPlayerDto implements Serializable {
    private final Team team;
    private List<Player> players;
}
