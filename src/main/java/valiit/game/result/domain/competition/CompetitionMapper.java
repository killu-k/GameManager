package valiit.game.result.domain.competition;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CompetitionMapper {
    Competition competitionDtoToCompetition(CompetitionDto competitionDto);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    CompetitionDto toDto(Competition competition);

    List<CompetitionDto> toDto(List<Competition> competition);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateCompetitionFromCompetitionDto(CompetitionDto competitionDto, @MappingTarget Competition competition);
}
