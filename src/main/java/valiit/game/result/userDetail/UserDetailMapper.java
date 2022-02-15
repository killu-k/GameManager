package valiit.game.result.userDetail;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserDetailMapper {
    UserDetail userDetailDtoToUserDetail(UserDetailDto userDetailDto);

    UserDetailDto userDetailToUserDetailDto(UserDetail userDetail);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserDetailFromUserDetailDto(UserDetailDto userDetailDto, @MappingTarget UserDetail userDetail);
}
