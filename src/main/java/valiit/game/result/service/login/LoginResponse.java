package valiit.game.result.service.login;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import valiit.game.result.domain.role.RoleDto;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LoginResponse {
    private Integer userId;
    private String firstName;
    private String lastName;
    private  List<RoleDto> roles;
}
