package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.EntrepriseGetDto;
import mg.rjc.stock.dto.EntreprisePostDto;
import mg.rjc.stock.dto.EntrepriseSlimDto;
import mg.rjc.stock.mapper.AdresseMapper;
import mg.rjc.stock.mapper.EntrepriseMapper;
import mg.rjc.stock.model.EntrepriseEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class EntrepriseMapperImpl implements EntrepriseMapper {

    private final AdresseMapper adresseMapper;

    @Override
    public EntrepriseGetDto fromEntity(EntrepriseEntity entrepriseEntity) {
        if( entrepriseEntity == null ) return null;
        return EntrepriseGetDto.builder()
                .id(entrepriseEntity.getId())
                .nom(entrepriseEntity.getNom())
                .description(entrepriseEntity.getDescription())
                .codeFiscal(entrepriseEntity.getCodeFiscal())
                .email(entrepriseEntity.getEmail())
                .photo(entrepriseEntity.getPhoto())
                .telephone(entrepriseEntity.getTelephone())
                .siteWeb(entrepriseEntity.getSiteWeb())
                .adresse(adresseMapper.fromEntity(entrepriseEntity.getAdresse()))
                .build();
    }

    @Override
    public EntrepriseEntity toEntity(EntreprisePostDto entreprisePostDto) {
        if( entreprisePostDto == null ) return null;
        EntrepriseEntity entrepriseEntity = new EntrepriseEntity();
        entrepriseEntity.setNom(entreprisePostDto.getNom());
        entrepriseEntity.setDescription(entreprisePostDto.getDescription());
        entrepriseEntity.setCodeFiscal(entreprisePostDto.getCodeFiscal());
        entrepriseEntity.setEmail(entreprisePostDto.getEmail());
        entrepriseEntity.setPhoto(entreprisePostDto.getPhoto());
        entrepriseEntity.setTelephone(entreprisePostDto.getTelephone());
        entrepriseEntity.setSiteWeb(entreprisePostDto.getSiteWeb());
        entrepriseEntity.setAdresse(adresseMapper.toEntity(entreprisePostDto.getAdresse()));
        return entrepriseEntity;
    }

    @Override
    public EntrepriseEntity entrepriseSlimToEntity(EntrepriseSlimDto entrepriseSlimDto) {
        EntrepriseEntity entrepriseEntity = new EntrepriseEntity();
        entrepriseEntity.setId(entrepriseEntity.getId());
        entrepriseEntity.setNom(entrepriseSlimDto.getNom());
        return entrepriseEntity;
    }
}
