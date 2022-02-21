package valiit.game.result.domain.user;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.validation.ValidationService;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.Optional;

@Service
public class UserService {

    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;

    @Transactional
    public User getValidUserByUserNameAndPassword(String userName, String password) {
        Optional<User> user = userRepository.findByUserNameAndPassword(userName, password);
        validationService.validateUserExists(user);
        return user.get();
    }

    public User findById(Integer userId) {
        return userRepository.findById(userId).get();
    }


//    public LoginResponse findUserDetailByUserNamePassword(String userName, String password) {
//        User byUserNamePassword = userRepository.findByUserNamePassword(userName, password);
//        UserDto userDto = userMapper.userToUserDto(byUserNamePassword);
//
//        UserDetailDto userDetail = userDto.getUserDetail();
//        String firstName = userDetail.getFirstName();
//        String lastName = userDetail.getLastName();
//
//        UserRole userRoleByUserId = userRoleRepository.findByUserId(userDto.getId());
//        List<UserRole> userRolesByUserId = userRoleRepository.findUserRolesByUserId(userDto.getId());
//
//        List<Role> userRoles = new ArrayList<>();
//        for (UserRole userRole : userRolesByUserId) {
//
//        }
//
//
//
//
//
//
//
//        return null;
//    }
}
