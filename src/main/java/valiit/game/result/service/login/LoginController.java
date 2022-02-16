package valiit.game.result.service.login;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import valiit.game.result.domain.user.UserService;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")

public class LoginController {

    @Resource
    private LoginService loginService;

    // TODO: siin kasutate vaid LoginServicet.
    //  loginServices kasutate vaid UserServicet ja UserRoleServicet.
    //  eesmark on leida ylesse koigepealt user tabelist user
    //  seejarel leida user id jargi ylesse koik rollid.
    //  Ja mappida see info LoginResponse klassi ja tagastada see objekt

    @GetMapping("/user") //vaata üle!!!!!!
    public LoginResponse login(@RequestParam String userName, @RequestParam String password) {
        LoginResponse response = loginService.login(userName, password);
        return response;
    }





}
