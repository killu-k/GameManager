package valiit.game.result.domain.competition;

import lombok.Data;

import java.io.Serializable;

@Data
public class CompetitionDto implements Serializable {
    private final Integer id;
    private final String name;
}
