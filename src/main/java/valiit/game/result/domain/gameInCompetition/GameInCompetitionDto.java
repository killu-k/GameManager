package valiit.game.result.domain.gameInCompetition;

import lombok.Data;
import valiit.game.result.domain.competition.CompetitionDto;
import valiit.game.result.domain.game.GameDto;

import java.io.Serializable;

@Data
public class GameInCompetitionDto implements Serializable {
    private final Integer id;
    private final String name;
    private final CompetitionDto competition;
    private final GameDto game;
}
