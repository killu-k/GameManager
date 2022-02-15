package valiit.game.result.user;

import lombok.Data;
import valiit.game.result.userDetail.UserDetailDto;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final Integer id;
    private final UserDetailDto userDetail;
    private final String userName;
    private final String password;
}
