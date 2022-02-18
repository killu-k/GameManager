package valiit.game.result.service.game;

import lombok.Data;
import valiit.game.result.domain.team.TeamDto;

import java.util.List;
@Data
public class AddTeamsToGameRequest {
    private Integer gameId;
    private List<Integer> teamIds;
}
