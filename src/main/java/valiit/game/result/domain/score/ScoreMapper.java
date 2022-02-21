package valiit.game.result.domain.score;

import org.mapstruct.*;
import valiit.game.result.service.score.RefereeScoreDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ScoreMapper {

    @Mapping(target = "scoreId", source = "id")
    @Mapping(target = "teamName", source = "team.name")
    RefereeScoreDto toRefereeScoreDto(Score score);

    List<RefereeScoreDto> toRefereeScoreDtos(List<Score> score);


    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateScoreFromScoreDto(ScoreDto scoreDto, @MappingTarget Score score);
}
