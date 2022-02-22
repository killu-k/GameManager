package valiit.game.result.service.newteam;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class NewTeamPlayerDto {
    private final Integer teamPlayerId;
    private final String firstName;
    private final String lastName;
    private final BigDecimal age;
}
