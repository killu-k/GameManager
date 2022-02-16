package valiit.game.result.domain.userInGame;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserInGameMapper {
    UserInGame userInGameDtoToUserInGame(UserInGameDto userInGameDto);

    UserInGameDto userInGameToUserInGameDto(UserInGame userInGame);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserInGameFromUserInGameDto(UserInGameDto userInGameDto, @MappingTarget UserInGame userInGame);
}
