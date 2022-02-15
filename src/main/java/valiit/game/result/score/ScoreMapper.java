package valiit.game.result.score;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface ScoreMapper {
    Score scoreDtoToScore(ScoreDto scoreDto);

    ScoreDto scoreToScoreDto(Score score);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateScoreFromScoreDto(ScoreDto scoreDto, @MappingTarget Score score);
}
