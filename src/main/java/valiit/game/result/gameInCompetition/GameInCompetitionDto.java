package valiit.game.result.gameInCompetition;

import lombok.Data;
import valiit.game.result.competition.CompetitionDto;
import valiit.game.result.game.GameDto;

import java.io.Serializable;

@Data
public class GameInCompetitionDto implements Serializable {
    private final Integer id;
    private final String name;
    private final CompetitionDto competition;
    private final GameDto game;
}
