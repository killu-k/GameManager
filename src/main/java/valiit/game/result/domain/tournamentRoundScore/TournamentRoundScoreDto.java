package valiit.game.result.domain.tournamentRoundScore;

import lombok.Data;
import valiit.game.result.domain.tournamentGroup.TournamentGroupDto;

import java.io.Serializable;

@Data
public class TournamentRoundScoreDto implements Serializable {
    private final Integer id;
    private final Integer teamAResult;
    private final Integer teamBResult;
    private final TournamentGroupDto tournamentGroup;
}
