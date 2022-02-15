package valiit.game.result.infrastructure.exception;

import lombok.Data;

@Data
public class GameServiceException extends RuntimeException {
    private String message;
    private Integer errorCode;

    public GameServiceException(String message, Integer errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }
}
