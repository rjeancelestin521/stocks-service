package mg.rjc.stock.mapper.impl;

import mg.rjc.stock.dto.CategorieGetDto;
import mg.rjc.stock.dto.CategoriePostDto;
import mg.rjc.stock.dto.CategorieSlimDto;
import mg.rjc.stock.mapper.CategorieMapper;
import mg.rjc.stock.model.CategorieEntity;
import org.springframework.stereotype.Component;

@Component
public class CategorieMapperImpl implements CategorieMapper {

    @Override
    public CategorieGetDto fromEntity(CategorieEntity categorieEntity) {
        if( categorieEntity == null ) return null;
        return CategorieGetDto.builder()
                .id(categorieEntity.getId())
                .codeCategorie(categorieEntity.getCodeCategorie())
                .designation(categorieEntity.getDesignation())
                .idEntreprise(categorieEntity.getIdEntreprise())
                .build();
    }

    @Override
    public CategorieEntity toEntity(CategoriePostDto categoriePostDto) {
        if( categoriePostDto == null ) return null;
        CategorieEntity categorieEntity = new CategorieEntity();
        categorieEntity.setCodeCategorie(categoriePostDto.getCodeCategorie());
        categorieEntity.setDesignation(categoriePostDto.getDesignation());
        categorieEntity.setIdEntreprise(categoriePostDto.getIdEntreprise());
        return categorieEntity;
    }

    @Override
    public CategorieEntity categorieSlimToEntity(CategorieSlimDto categorieSlimDto) {
        CategorieEntity categorieEntity = new CategorieEntity();
        categorieEntity.setId(categorieEntity.getId());
        categorieEntity.setDesignation(categorieSlimDto.getDesignation());
        return categorieEntity;
    }
}
