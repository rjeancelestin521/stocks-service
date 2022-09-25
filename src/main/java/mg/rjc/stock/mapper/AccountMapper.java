package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.*;
import mg.rjc.stock.model.RoleEntity;
import mg.rjc.stock.model.UtilisateurEntity;

import java.util.Collection;

public interface AccountMapper {
    // ROLE MAPPING
    RoleGetDto roleEntityToRoleGetDto(RoleEntity roleEntity);
    RoleEntity rolePostDtoToRoleEntity(RolePostDto roleRequestDto);
    Collection<RoleGetDto> rolesEntityToRolesGet(Collection<RoleEntity> roleEntities);

    // USER MAPPING
    UtilisateurGetDto utilisateurEntityToUtilisateurGetDto(UtilisateurEntity utilisateurEntity);
    UtilisateurEntity utilisateurPostDtoToUtilisateurEntity(UtilisateurPostDto utilisateurPostDto);
    UtilisateurEntity utilisateurSlimDtoToUtilisateurEntity(UtilisateurSlimDto utilisateurSlimDto);
}
