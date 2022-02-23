package valiit.game.result.domain.gameType;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GameTypeMapper {
    GameType gameTypeDtoToGameType(GameTypeDto gameTypeDto);

    GameTypeDto gameTypeToGameTypeDto(GameType gameType);
    List<GameTypeDto> gameTypesToGameTypeDtos(List<GameType> gameType);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateGameTypeFromGameTypeDto(GameTypeDto gameTypeDto, @MappingTarget GameType gameType);
}
