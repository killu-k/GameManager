package valiit.game.result.domain.teamPlayer;

import org.mapstruct.*;
import valiit.game.result.service.newteam.NewTeamPlayerDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TeamPlayerMapper {

    @Mapping(target = "teamPlayerId", source = "id")
    @Mapping(target = "firstName", source = "player.firstName")
    @Mapping(target = "lastName", source = "player.lastName")
    @Mapping(target = "age", source = "player.age")
    NewTeamPlayerDto toDto(TeamPlayer teamPlayer);

    List<NewTeamPlayerDto> toDtos(List<TeamPlayer> teamPlayer);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTeamPlayerFromTeamPlayerDto(TeamPlayerDto teamPlayerDto, @MappingTarget TeamPlayer teamPlayer);
}
