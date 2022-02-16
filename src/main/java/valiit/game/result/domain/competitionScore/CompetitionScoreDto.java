package valiit.game.result.domain.competitionScore;

import lombok.Data;
import valiit.game.result.domain.competition.CompetitionDto;
import valiit.game.result.domain.team.TeamDto;

import java.io.Serializable;

@Data
public class CompetitionScoreDto implements Serializable {
    private final Integer id;
    private final CompetitionDto competition;
    private final TeamDto team;
    private final Integer points;
}
