package valiit.game.result.tournamentResult;

import lombok.Data;
import valiit.game.result.team.TeamDto;

import java.io.Serializable;

@Data
public class TournamentResultDto implements Serializable {
    private final Integer id;
    private final Integer points;
    private final TeamDto team;
}
