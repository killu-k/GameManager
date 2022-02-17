package valiit.game.result.domain.player;

import org.mapstruct.*;
import valiit.game.result.service.team.NewTeamRequest;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PlayerMapper {

    PlayerDto playerToPlayerDto(Player player);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePlayerFromPlayerDto(PlayerDto playerDto, @MappingTarget Player player);

  //  @Mapping(target = "firstName", source = "firstName")
  //  @Mapping(target = "lastName", source = "lastName")
//   @Mapping(target = "age", source = "age")


    Player playerDtoToPlayer(PlayerDto player);
    List<Player> playerDtosToPlayers(List<PlayerDto> players);
}
