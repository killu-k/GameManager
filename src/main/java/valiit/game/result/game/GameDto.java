package valiit.game.result.game;

import lombok.Data;
import valiit.game.result.gameType.GameTypeDto;
import valiit.game.result.status.StatusDto;

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
