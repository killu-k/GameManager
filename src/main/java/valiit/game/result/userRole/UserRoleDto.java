package valiit.game.result.userRole;

import lombok.Data;
import valiit.game.result.role.RoleDto;
import valiit.game.result.user.UserDto;

import java.io.Serializable;

@Data
public class UserRoleDto implements Serializable {
    private final Integer id;
    private final UserDto user;
    private final RoleDto role;
}
