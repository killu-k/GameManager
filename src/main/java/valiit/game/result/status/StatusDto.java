package valiit.game.result.status;

import lombok.Data;

import java.io.Serializable;

@Data
public class StatusDto implements Serializable {
    private final Integer id;
    private final String name;
}
