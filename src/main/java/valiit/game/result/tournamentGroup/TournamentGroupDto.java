package valiit.game.result.tournamentGroup;

import lombok.Data;
import valiit.game.result.game.GameDto;
import valiit.game.result.team.TeamDto;

import java.io.Serializable;

@Data
public class TournamentGroupDto implements Serializable {
    private final Integer id;
    private final GameDto game;
    private final Integer roundNumber;
    private final TeamDto team;
    private final Integer teamBId;
    private final Integer groupNumber;
}
