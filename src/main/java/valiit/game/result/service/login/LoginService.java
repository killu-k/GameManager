package valiit.game.result.service.login;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import valiit.game.result.domain.user.User;
import valiit.game.result.domain.user.UserService;

import javax.annotation.Resource;

@Service
public class LoginService {


    // TODO: siin kasutate vaid LoginServicet.
    //  loginServices kasutate vaid UserServicet ja UserRoleServicet.
    //  eesmark on leida ylesse koigepealt user tabelist user_detail_dto
    //  seejarel leida user id jargi ylesse koik rollid.
    //  Ja mappida see info LoginResponse klassi ja tagastada see objekt

    @Resource
    private UserService userService;

    public LoginResponse login(String userName, String password) {
        User user = userService.getValidUserByUserNameAndPassword(userName, password);


        return null;
    }
}
