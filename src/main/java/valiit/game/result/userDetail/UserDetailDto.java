package valiit.game.result.userDetail;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDetailDto implements Serializable {
    private final Integer id;
    private final String firstName;
    private final String lastName;
}
