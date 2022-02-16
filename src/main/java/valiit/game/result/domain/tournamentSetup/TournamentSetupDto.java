package valiit.game.result.domain.tournamentSetup;

import lombok.Data;
import valiit.game.result.domain.game.GameDto;

import java.io.Serializable;

@Data
public class TournamentSetupDto implements Serializable {
    private final Integer id;
    private final GameDto game;
    private final Integer numberOfGroups;
    private final Integer pointsPerRound;
}
