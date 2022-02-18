package valiit.game.result.domain.team;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TeamMapper {
    Team teamDtoToTeam(TeamDto teamDto);

    List<Team> teamDtosToTeams(List<TeamDto> teamDto);

    TeamDto teamToTeamDto(Team team);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTeamFromTeamDto(TeamDto teamDto, @MappingTarget Team team);

}
