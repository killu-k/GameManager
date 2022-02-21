package valiit.game.result.domain.userInGame;

import org.mapstruct.*;
import valiit.game.result.domain.game.Game;
import valiit.game.result.domain.user.User;

import javax.persistence.*;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserInGameMapper {
    UserInGame toEntity(UserInGameDto userInGameDto);

    @Mapping(target = "firstName", source = "user.userDetail.firstName")
    @Mapping(target = "lastName", source = "user.userDetail.lastName")
    @Mapping(target = "gameTypeName", source = "game.gameType.name")
    @Mapping(target = "gameName", source = "game.name")
    UserInGameDto toDto(UserInGame userInGame);
    List<UserInGameDto> toDtos(List<UserInGame> userInGame);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserInGameFromUserInGameDto(UserInGameDto userInGameDto, @MappingTarget UserInGame userInGame);
}
