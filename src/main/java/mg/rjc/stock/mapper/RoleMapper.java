package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.RoleRequestDto;
import mg.rjc.stock.dto.RoleResponseDto;
import mg.rjc.stock.model.RoleEntity;

public interface RoleMapper {

    RoleResponseDto roleEntityToRoleResponseDto(RoleEntity roleEntity);
    RoleEntity roleRequestDtoToRoleEntity(RoleRequestDto roleRequestDto);

}
