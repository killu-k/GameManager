package valiit.game.result.gameInCompetition;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface GameInCompetitionMapper {
    GameInCompetition gameInCompetitionDtoToGameInCompetition(GameInCompetitionDto gameInCompetitionDto);

    GameInCompetitionDto gameInCompetitionToGameInCompetitionDto(GameInCompetition gameInCompetition);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateGameInCompetitionFromGameInCompetitionDto(GameInCompetitionDto gameInCompetitionDto, @MappingTarget GameInCompetition gameInCompetition);
}
