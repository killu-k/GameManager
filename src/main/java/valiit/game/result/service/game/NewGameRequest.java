package valiit.game.result.service.game;

import lombok.Data;
import valiit.game.result.domain.team.TeamDto;

import java.util.List;
@Data
public class NewGameRequest {

    private Integer gameId;
    private List<TeamDto> teamIds;
}
