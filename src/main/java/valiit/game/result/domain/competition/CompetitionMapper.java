package valiit.game.result.domain.competition;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CompetitionMapper {
    Competition competitionDtoToCompetition(CompetitionDto competitionDto);

    CompetitionDto competitionToCompetitionDto(Competition competition);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCompetitionFromCompetitionDto(CompetitionDto competitionDto, @MappingTarget Competition competition);
}
