package valiit.game.result.service.score;

import lombok.Data;


@Data
public class RefereeScoreDto {
    private Integer scoreId;
    private String teamName;
    private Long timeInSeconds;
    private Integer refereeScore;
    private Integer points;
}
