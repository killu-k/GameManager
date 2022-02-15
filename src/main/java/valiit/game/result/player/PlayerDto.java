package valiit.game.result.player;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class PlayerDto implements Serializable {
    private final Integer id;
    private final String firstName;
    private final String lastName;
    private final BigDecimal age;
}
