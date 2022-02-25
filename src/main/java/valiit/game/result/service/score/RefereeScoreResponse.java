package valiit.game.result.service.score;

import lombok.Data;

import java.util.List;

@Data
public class RefereeScoreResponse {
    private String gameName;
    private Integer gameTypeId;
    private List<RefereeScoreDto> scoreDetails;
}
