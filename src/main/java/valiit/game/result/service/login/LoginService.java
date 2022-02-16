package valiit.game.result.service.login;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.role.RoleDto;
import valiit.game.result.domain.user.User;
import valiit.game.result.domain.user.UserService;
import valiit.game.result.domain.userDetail.UserDetail;
import valiit.game.result.domain.userRole.UserRole;
import valiit.game.result.domain.userRole.UserRoleMapper;
import valiit.game.result.domain.userRole.UserRoleService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LoginService {


    // TODO: siin kasutate vaid LoginServicet.
    //  loginServices kasutate vaid UserServicet ja UserRoleServicet.
    //  eesmark on leida ylesse koigepealt user tabelist user_detail_dto
    //  seejarel leida user id jargi ylesse koik rollid.
    //  Ja mappida see info LoginResponse klassi ja tagastada see objekt

    @Resource
    private UserService userService;

    @Resource
    private UserRoleService userRoleService;

    @Resource
    private UserRoleMapper userRoleMapper;

    public LoginResponse login(String userName, String password) {
        User user = userService.getValidUserByUserNameAndPassword(userName, password);
        Integer userId = user.getId();
        List<UserRole> entityUserRoles = userRoleService.getUserRolesByUserId(userId);
        List<RoleDto> roleDtos = userRoleMapper.userRolesToRoleDtos(entityUserRoles);
        UserDetail userDetail = user.getUserDetail();
        LoginResponse response = new LoginResponse();
        response.setUserId(userId);
        response.setFirstName(userDetail.getFirstName());
        response.setLastName(userDetail.getLastName());
        response.setRoles(roleDtos);

        return response;
    }
}
