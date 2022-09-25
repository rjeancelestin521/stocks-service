package mg.rjc.stock.mapper.impl;

import mg.rjc.stock.dto.VenteGetDto;
import mg.rjc.stock.dto.VentePostDto;
import mg.rjc.stock.dto.VenteSlimDto;
import mg.rjc.stock.mapper.VenteMapper;
import mg.rjc.stock.model.VenteEntity;
import org.springframework.stereotype.Component;

@Component
public class VenteMapperImpl implements VenteMapper {

    @Override
    public VenteGetDto fromEntity(VenteEntity venteEntity) {
        if( venteEntity == null ) return null;
        return VenteGetDto.builder()
                .id(venteEntity.getId())
                .code(venteEntity.getCode())
                .dateVente(venteEntity.getDateVente())
                .commentaire(venteEntity.getCommentaire())
                .idEntreprise(venteEntity.getIdEntreprise())
                .build();
    }

    @Override
    public VenteEntity toEntity(VentePostDto ventePostDto) {
        if( ventePostDto == null ) return null;
        VenteEntity venteEntity = new VenteEntity();
        venteEntity.setCode(ventePostDto.getCode());
        venteEntity.setDateVente(ventePostDto.getDateVente());
        venteEntity.setCommentaire(ventePostDto.getCommentaire());
        venteEntity.setIdEntreprise(ventePostDto.getIdEntreprise());
        return venteEntity;
    }

    @Override
    public VenteEntity venteSlimToEntity(VenteSlimDto venteSlimDto) {
        if( venteSlimDto == null ) return null;
        VenteEntity venteEntity = new VenteEntity();
        venteEntity.setId(venteSlimDto.getId());
        venteEntity.setCode(venteSlimDto.getCode());
        return venteEntity;
    }
}
