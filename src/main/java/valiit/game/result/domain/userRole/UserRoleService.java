package valiit.game.result.domain.userRole;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.role.RoleRepository;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserRoleService {

    @Resource
    private UserRoleRepository userRoleRepository;

    @Resource
    private UserRoleMapper userRoleMapper;

    @Resource
    private RoleRepository roleRepository;


//    public User getValidUserByUserNameAndPassword(String userName, String password) {
//        Optional<User> user = userRepository.findByUserNameAndPassword(userName, password);
//        validationService.validateUserExists(user);
//        return user.get();
//    }

//    public Role getRoleNamesByRoleId(UserRole userRole) {
//        UserRoleDto userRoleDto = userRoleMapper.userRoleToUserRoleDto(userRole);
//        RoleDto role = userRoleDto.getRole();
//
//
//    }

    public List<UserRole>   getUserRolesByUserId(Integer userId) {
        List<UserRole> userRoles = userRoleRepository.findByUserId(userId);
        return userRoles;
    }
}
