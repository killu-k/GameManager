package valiit.game.result.domain.game;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GameMapper {
    Game gameDtoToGame(GameDto gameDto);

    GameDto gameToGameDto(Game game);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateGameFromGameDto(GameDto gameDto, @MappingTarget Game game);
}
