package valiit.game.result.domain.gameType;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GameTypeMapper {
    GameType gameTypeDtoToGameType(GameTypeDto gameTypeDto);

    GameTypeDto gameTypeToGameTypeDto(GameType gameType);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateGameTypeFromGameTypeDto(GameTypeDto gameTypeDto, @MappingTarget GameType gameType);
}
