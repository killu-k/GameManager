package valiit.game.result.gameType;

import lombok.Data;

import java.io.Serializable;

@Data
public class GameTypeDto implements Serializable {
    private final Integer id;
    private final String name;
}
