package valiit.game.result.domain.role;

import lombok.Data;

import java.io.Serializable;

@Data
public class RoleDto implements Serializable {
    private final Integer roleId;
    private final String roleName;
}
