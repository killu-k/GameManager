package valiit.game.result.service.game;

import lombok.Data;

@Data
public class AddNewGameRequest {
    private Integer competitionId;
    private Integer gameTypeId;
    private String gameName;

}
