package valiit.game.result.tournamentResult;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TournamentResultMapper {
    TournamentResult tournamentResultDtoToTournamentResult(TournamentResultDto tournamentResultDto);

    TournamentResultDto tournamentResultToTournamentResultDto(TournamentResult tournamentResult);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTournamentResultFromTournamentResultDto(TournamentResultDto tournamentResultDto, @MappingTarget TournamentResult tournamentResult);
}
