package valiit.game.result.domain.userRole;

import org.mapstruct.*;
import valiit.game.result.domain.role.RoleDto;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface UserRoleMapper {
    UserRole userRoleDtoToUserRole(UserRoleDto userRoleDto);

    UserRoleDto userRoleToUserRoleDto(UserRole userRole);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateUserRoleFromUserRoleDto(UserRoleDto userRoleDto, @MappingTarget UserRole userRole);

    @Mapping(target = "roleId", source = "role.id")
    @Mapping(target = "roleName", source = "role.name")
    RoleDto userRoleToRoleDto(UserRole userRole);


    List<RoleDto> userRolesToRoleDtos(List<UserRole> userRoles);


}
