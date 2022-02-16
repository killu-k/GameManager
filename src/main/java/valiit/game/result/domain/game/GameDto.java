package valiit.game.result.domain.game;

import lombok.Data;
import valiit.game.result.domain.status.StatusDto;
import valiit.game.result.domain.gameType.GameTypeDto;

import java.io.Serializable;
import java.time.LocalDate;

@Data
public class GameDto implements Serializable {
    private final Integer id;
    private final GameTypeDto gameType;
    private final StatusDto status;
    private final String name;
    private final LocalDate date;
}
