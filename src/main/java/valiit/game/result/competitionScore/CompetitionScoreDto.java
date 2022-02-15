package valiit.game.result.competitionScore;

import lombok.Data;
import valiit.game.result.competition.CompetitionDto;
import valiit.game.result.team.TeamDto;

import java.io.Serializable;

@Data
public class CompetitionScoreDto implements Serializable {
    private final Integer id;
    private final CompetitionDto competition;
    private final TeamDto team;
    private final Integer points;
}
