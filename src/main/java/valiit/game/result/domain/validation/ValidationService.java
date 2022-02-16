package valiit.game.result.domain.validation;

import org.springframework.stereotype.Service;
import valiit.game.result.domain.user.User;
import valiit.game.result.infrastructure.exception.DataNotFoundException;

import java.util.Optional;

@Service
public class ValidationService {

    public static final String USER_DOES_NOT_EXIST = "Incorrect username/ password or account does not exist";
    public static final int USER_NOT_EXIST_ERROR_CODE = 666;

    public void validateUserExists(Optional<User> user) {
        if (user.isEmpty()) {
            throw new DataNotFoundException(USER_DOES_NOT_EXIST, USER_NOT_EXIST_ERROR_CODE);
        }
    }

}
