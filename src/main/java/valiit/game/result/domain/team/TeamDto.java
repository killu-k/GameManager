package valiit.game.result.domain.team;

import lombok.Data;
import valiit.game.result.domain.status.StatusDto;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class TeamDto implements Serializable {
    private final Integer id;
    private final String name;
    private final BigDecimal averageAge;
    private final StatusDto status;
}
