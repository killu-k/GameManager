package valiit.game.result.service.user;

import lombok.Data;

import java.util.List;
@Data
public class AddGamesToUserRequest {
    private Integer userId;
    private List<Integer> gameIds;
}
