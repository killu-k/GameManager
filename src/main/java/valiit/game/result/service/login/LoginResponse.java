package valiit.game.result.service.login;

import lombok.Data;
import valiit.game.result.domain.role.RoleDto;

import java.util.List;

@Data
public class LoginResponse {
    private final Integer userId;
    private final String firstName;
    private final String lastName;
    private final List<RoleDto> roles;
}
