package valiit.game.result.tournamentGroup;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TournamentGroupMapper {
    TournamentGroup tournamentGroupDtoToTournamentGroup(TournamentGroupDto tournamentGroupDto);

    TournamentGroupDto tournamentGroupToTournamentGroupDto(TournamentGroup tournamentGroup);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTournamentGroupFromTournamentGroupDto(TournamentGroupDto tournamentGroupDto, @MappingTarget TournamentGroup tournamentGroup);
}
