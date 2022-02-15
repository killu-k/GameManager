package valiit.game.result.tournamentRoundScore;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface TournamentRoundScoreMapper {
    TournamentRoundScore tournamentRoundScoreDtoToTournamentRoundScore(TournamentRoundScoreDto tournamentRoundScoreDto);

    TournamentRoundScoreDto tournamentRoundScoreToTournamentRoundScoreDto(TournamentRoundScore tournamentRoundScore);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateTournamentRoundScoreFromTournamentRoundScoreDto(TournamentRoundScoreDto tournamentRoundScoreDto, @MappingTarget TournamentRoundScore tournamentRoundScore);
}
