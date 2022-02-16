package valiit.game.result.domain.tournamentSetup;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TournamentSetupMapper {
    TournamentSetup tournamentSetupDtoToTournamentSetup(TournamentSetupDto tournamentSetupDto);

    TournamentSetupDto tournamentSetupToTournamentSetupDto(TournamentSetup tournamentSetup);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTournamentSetupFromTournamentSetupDto(TournamentSetupDto tournamentSetupDto, @MappingTarget TournamentSetup tournamentSetup);
}
