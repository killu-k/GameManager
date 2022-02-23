package valiit.game.result.service.competition;

import lombok.Data;

@Data
public class NewCompetitionDto {
    private final Integer gameInCompetitionId;
    private final String competitionName;
    private final String gameName;
}
