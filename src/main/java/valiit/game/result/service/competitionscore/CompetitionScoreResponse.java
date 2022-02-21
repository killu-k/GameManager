package valiit.game.result.service.competitionscore;

import lombok.Data;

import java.util.List;

@Data
public class CompetitionScoreResponse {

    private Integer teamId;
    private List<CompetitionScoreGameDto> competitionScoreDetails;
}
