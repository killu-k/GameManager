package valiit.game.result.domain.player;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PlayerMapper {
    Player playerDtoToPlayer(PlayerDto playerDto);

    PlayerDto playerToPlayerDto(Player player);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePlayerFromPlayerDto(PlayerDto playerDto, @MappingTarget Player player);
}
