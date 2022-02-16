package valiit.game.result.domain.user;

import lombok.Data;
import valiit.game.result.domain.userDetail.UserDetailDto;

import java.io.Serializable;

@Data
public class UserDto implements Serializable {
    private final Integer id;
    private final UserDetailDto userDetail;
    private final String userName;
    private final String password;
}
