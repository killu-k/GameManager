package valiit.game.result.competitionScore;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CompetitionScoreMapper {
    CompetitionScore competitionScoreDtoToCompetitionScore(CompetitionScoreDto competitionScoreDto);

    CompetitionScoreDto competitionScoreToCompetitionScoreDto(CompetitionScore competitionScore);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCompetitionScoreFromCompetitionScoreDto(CompetitionScoreDto competitionScoreDto, @MappingTarget CompetitionScore competitionScore);
}
