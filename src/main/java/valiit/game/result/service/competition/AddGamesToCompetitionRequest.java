package valiit.game.result.service.competition;

import lombok.Data;

import java.util.List;

@Data
public class AddGamesToCompetitionRequest {
    private Integer competitionId;
    private List<Integer> gameIds;
}
