package valiit.game.result.service.score;

import lombok.Data;

import java.util.List;

@Data
public class RefereeScoreUpdateRequest {
    private List<RefereeScoreDto> scoreDetails;
}
