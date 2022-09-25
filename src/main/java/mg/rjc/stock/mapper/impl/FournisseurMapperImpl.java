package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.FournisseurGetDto;
import mg.rjc.stock.dto.FournisseurPostDto;
import mg.rjc.stock.dto.FournisseurSlimDto;
import mg.rjc.stock.mapper.AdresseMapper;
import mg.rjc.stock.mapper.FournisseurMapper;
import mg.rjc.stock.model.FournisseurEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class FournisseurMapperImpl implements FournisseurMapper {

    private final AdresseMapper adresseMapper;

    @Override
    public FournisseurGetDto fromEntity(FournisseurEntity fournisseurEntity) {
        if( fournisseurEntity == null ) return null;
        return FournisseurGetDto.builder()
                .id(fournisseurEntity.getId())
                .nom(fournisseurEntity.getNom())
                .prenom(fournisseurEntity.getPrenom())
                .email(fournisseurEntity.getEmail())
                .telephone(fournisseurEntity.getTelephone())
                .photo(fournisseurEntity.getPhoto())
                .idEntreprise(fournisseurEntity.getIdEntreprise())
                .adresse(adresseMapper.fromEntity(fournisseurEntity.getAdresse()))
                .build();
    }

    @Override
    public FournisseurEntity toEntity(FournisseurPostDto fournisseurPostDto) {
        if( fournisseurPostDto == null ) return null;
        FournisseurEntity fournisseurEntity = new FournisseurEntity();
        fournisseurEntity.setNom(fournisseurPostDto.getNom());
        fournisseurEntity.setPrenom(fournisseurPostDto.getPrenom());
        fournisseurEntity.setEmail(fournisseurPostDto.getEmail());
        fournisseurEntity.setTelephone(fournisseurPostDto.getTelephone());
        fournisseurEntity.setPhoto(fournisseurPostDto.getPhoto());
        fournisseurEntity.setIdEntreprise(fournisseurPostDto.getIdEntreprise());
        fournisseurEntity.setAdresse(adresseMapper.toEntity(fournisseurPostDto.getAdresse()));
        return fournisseurEntity;
    }

    @Override
    public FournisseurEntity fournisseurSlimToEntity(FournisseurSlimDto fournisseurSlimDto) {
        if( fournisseurSlimDto == null ) return null;
        FournisseurEntity fournisseurEntity = new FournisseurEntity();
        fournisseurEntity.setId(fournisseurSlimDto.getId());
        fournisseurEntity.setNom(fournisseurSlimDto.getNom());
        fournisseurEntity.setPrenom(fournisseurSlimDto.getPrenom());
        fournisseurEntity.setEmail(fournisseurSlimDto.getEmail());
        return fournisseurEntity;
    }
}
