package valiit.game.result.team;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TeamMapper {
    Team teamDtoToTeam(TeamDto teamDto);

    TeamDto teamToTeamDto(Team team);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTeamFromTeamDto(TeamDto teamDto, @MappingTarget Team team);
}
