package valiit.game.result.domain.teamPlayer;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TeamPlayerMapper {
    TeamPlayer teamPlayerDtoToTeamPlayer(TeamPlayerDto teamPlayerDto);

    TeamPlayerDto teamPlayerToTeamPlayerDto(TeamPlayer teamPlayer);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTeamPlayerFromTeamPlayerDto(TeamPlayerDto teamPlayerDto, @MappingTarget TeamPlayer teamPlayer);
}
