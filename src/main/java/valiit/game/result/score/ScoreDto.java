package valiit.game.result.score;

import lombok.Data;
import valiit.game.result.game.GameDto;
import valiit.game.result.team.TeamDto;

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
