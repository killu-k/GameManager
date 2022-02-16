package valiit.game.result.domain.userRole;

import lombok.Data;
import valiit.game.result.domain.user.UserDto;
import valiit.game.result.domain.role.RoleDto;

import java.io.Serializable;

@Data
public class UserRoleDto implements Serializable {
    private final Integer id;
    private final UserDto user;
    private final RoleDto role;
}
