package valiit.game.result.service.newteam;

import lombok.Data;
import valiit.game.result.domain.player.PlayerDto;

@Data
public class NewTeamPlayerRequest {
    private Integer teamId;
    private PlayerDto player;
}
