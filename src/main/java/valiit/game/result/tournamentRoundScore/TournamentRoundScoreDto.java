package valiit.game.result.tournamentRoundScore;

import lombok.Data;
import valiit.game.result.tournamentGroup.TournamentGroupDto;

import java.io.Serializable;

@Data
public class TournamentRoundScoreDto implements Serializable {
    private final Integer id;
    private final Integer teamAResult;
    private final Integer teamBResult;
    private final TournamentGroupDto tournamentGroup;
}
