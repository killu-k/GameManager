package valiit.game.result.teamInGame;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TeamInGameMapper {
    TeamInGame teamInGameDtoToTeamInGame(TeamInGameDto teamInGameDto);

    TeamInGameDto teamInGameToTeamInGameDto(TeamInGame teamInGame);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTeamInGameFromTeamInGameDto(TeamInGameDto teamInGameDto, @MappingTarget TeamInGame teamInGame);
}
