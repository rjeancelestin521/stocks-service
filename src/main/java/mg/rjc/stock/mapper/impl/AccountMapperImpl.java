package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.*;
import mg.rjc.stock.mapper.AccountMapper;
import mg.rjc.stock.mapper.AdresseMapper;
import mg.rjc.stock.mapper.EntrepriseMapper;
import mg.rjc.stock.model.RoleEntity;
import mg.rjc.stock.model.UtilisateurEntity;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class AccountMapperImpl implements AccountMapper {

    private final AdresseMapper adresseMapper;
    private final EntrepriseMapper entrepriseMapper;

    @Override
    public RoleGetDto roleEntityToRoleGetDto(RoleEntity roleEntity) {
        if( roleEntity == null ) return null;
        return RoleGetDto.builder()
                .id(roleEntity.getId())
                .roleName(roleEntity.getRoleName())
                .utilisateur(utilisateurEntityToUtilisateurGetDto(roleEntity.getUtilisateur()))
                .build();
    }

    @Override
    public RoleEntity rolePostDtoToRoleEntity(RolePostDto roleRequestDto) {
        if(roleRequestDto == null) return null;
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setRoleName(roleEntity.getRoleName());
        return roleEntity;
    }

    @Override
    public Collection<RoleGetDto> rolesEntityToRolesGet(Collection<RoleEntity> roleEntities) {
        return roleEntities.stream()
                .map(this::roleEntityToRoleGetDto)
                .collect(Collectors.toList());
    }

    @Override
    public UtilisateurGetDto utilisateurEntityToUtilisateurGetDto(UtilisateurEntity utilisateurEntity) {
        if( utilisateurEntity == null ) return null;
        return UtilisateurGetDto.builder()
                .id(utilisateurEntity.getId())
                .nom(utilisateurEntity.getNom())
                .prenom(utilisateurEntity.getPrenom())
                .adresse(adresseMapper.fromEntity(utilisateurEntity.getAdresse()))
                .email(utilisateurEntity.getEmail())
                .photo(utilisateurEntity.getPhoto())
                .telephone(utilisateurEntity.getTelephone())
                .entreprise(entrepriseMapper.fromEntity(utilisateurEntity.getEntreprise()))
                .roles(rolesEntityToRolesGet(utilisateurEntity.getRoles()))
                .build();
    }

    @Override
    public UtilisateurEntity utilisateurPostDtoToUtilisateurEntity(UtilisateurPostDto utilisateurPostDto) {
        if(utilisateurPostDto == null) return null;
        UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
        utilisateurEntity.setNom(utilisateurEntity.getNom());
        utilisateurEntity.setPrenom(utilisateurPostDto.getPrenom());
        utilisateurEntity.setEmail(utilisateurPostDto.getEmail());
        utilisateurEntity.setMotDePasse(utilisateurPostDto.getConfirmMotDePasse());
        utilisateurEntity.setAdresse(adresseMapper.toEntity(utilisateurPostDto.getAdresse()));
        utilisateurEntity.setPhoto(utilisateurPostDto.getPhoto());
        utilisateurEntity.setTelephone(utilisateurPostDto.getTelephone());
        utilisateurEntity.setEntreprise(entrepriseMapper.entrepriseSlimToEntity(utilisateurPostDto.getEntreprise()));
        return utilisateurEntity;
    }

    @Override
    public UtilisateurEntity utilisateurSlimDtoToUtilisateurEntity(UtilisateurSlimDto utilisateurSlimDto) {
        if(utilisateurSlimDto == null) return null;
        UtilisateurEntity utilisateurEntity = new UtilisateurEntity();
        utilisateurEntity.setId(utilisateurSlimDto.getId());
        utilisateurEntity.setEmail(utilisateurSlimDto.getEmail());
        return utilisateurEntity;
    }
}
