package valiit.game.result.domain.gameInCompetition;

import org.mapstruct.*;
import valiit.game.result.service.competition.NewCompetitionDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GameInCompetitionMapper {

    @Mapping(target = "gameInCompetitionId", source = "id")
    @Mapping(target = "competitionName", source = "competition.name")
    @Mapping(target = "gameName", source = "game.name")

    @Mapping(target = "gameTypeId", source = "game.gameType.id")
    @Mapping(target = "gameTypeName", source = "game.gameType.name")
    NewCompetitionDto toDto(GameInCompetition gameInCompetition);

    List<NewCompetitionDto> toDtos(List<GameInCompetition> gameInCompetition);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateGameInCompetitionFromGameInCompetitionDto(GameInCompetitionDto gameInCompetitionDto, @MappingTarget GameInCompetition gameInCompetition);

}
