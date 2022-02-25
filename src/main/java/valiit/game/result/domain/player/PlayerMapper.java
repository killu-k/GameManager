package valiit.game.result.domain.player;

import org.mapstruct.*;
import valiit.game.result.service.player.NewPlayerDto;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PlayerMapper {


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePlayerFromNewPlayerDto(NewPlayerDto playerDto, @MappingTarget Player player);

    Player toEntity(PlayerDto player);

}
