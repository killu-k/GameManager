package valiit.game.result.domain.userRole;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserRoleMapper {
    UserRole userRoleDtoToUserRole(UserRoleDto userRoleDto);

    UserRoleDto userRoleToUserRoleDto(UserRole userRole);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserRoleFromUserRoleDto(UserRoleDto userRoleDto, @MappingTarget UserRole userRole);
}
