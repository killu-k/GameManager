package valiit.game.result.infrastructure.error;

import lombok.Data;

@Data
public class GameError {
    private String message;
    private Integer errorCode;
}
