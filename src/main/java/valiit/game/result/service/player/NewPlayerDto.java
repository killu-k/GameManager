package valiit.game.result.service.player;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class NewPlayerDto {
    private final String firstName;
    private final String lastName;
    private final BigDecimal age;
}
