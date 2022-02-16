package valiit.game.result.domain.score;

import lombok.Data;
import valiit.game.result.domain.game.GameDto;
import valiit.game.result.domain.team.TeamDto;

import java.io.Serializable;

@Data
public class ScoreDto implements Serializable {
    private final Integer id;
    private final GameDto game;
    private final TeamDto team;
    private final Long timeInSeconds;
    private final Integer refereeScore;
    private final Integer points;
}
