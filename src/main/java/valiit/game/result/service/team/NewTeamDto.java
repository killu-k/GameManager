package valiit.game.result.service.team;

import lombok.Data;
import valiit.game.result.domain.player.Player;
import valiit.game.result.domain.team.Team;

import java.util.List;

@Data
public class NewTeamDto {
    private Team team;
    private List<Player> players;
}
