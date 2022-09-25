package mg.rjc.stock.mapper.impl;

import mg.rjc.stock.dto.RoleRequestDto;
import mg.rjc.stock.dto.RoleResponseDto;
import mg.rjc.stock.mapper.RoleMapper;
import mg.rjc.stock.model.RoleEntity;
import org.springframework.stereotype.Component;

@Component
public class RoleMapperImpl implements RoleMapper {

    @Override
    public RoleResponseDto roleEntityToRoleResponseDto(RoleEntity roleEntity) {
        if( roleEntity == null ) return null;
        return RoleResponseDto.builder()
                .id(roleEntity.getId())
                .roleName(roleEntity.getRoleName())
                .build();
    }

    @Override
    public RoleEntity roleRequestDtoToRoleEntity(RoleRequestDto roleRequestDto) {
        return null;
    }
}
