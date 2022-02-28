package valiit.game.result.service.score;

import lombok.Data;

@Data
public class TimeScoreDto {
    private Integer scoreId;
    private String teamName;
    private Long timeInSeconds;
}
