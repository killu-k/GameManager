package valiit.game.result.service.team;

import lombok.Data;
import valiit.game.result.domain.player.PlayerDto;

import java.util.List;

@Data
public class NewTeamRequest {
    private String teamName;
    private List<PlayerDto> players;
}
