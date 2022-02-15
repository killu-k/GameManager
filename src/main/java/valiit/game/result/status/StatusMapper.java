package valiit.game.result.status;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface StatusMapper {
    Status statusDtoToStatus(StatusDto statusDto);

    StatusDto statusToStatusDto(Status status);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateStatusFromStatusDto(StatusDto statusDto, @MappingTarget Status status);
}
