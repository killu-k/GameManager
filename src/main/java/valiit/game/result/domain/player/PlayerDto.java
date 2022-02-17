package valiit.game.result.domain.player;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PlayerDto implements Serializable {
    private final String firstName;
    private final String lastName;
    private final BigDecimal age;
}
