package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.CategorieGetDto;
import mg.rjc.stock.dto.CategoriePostDto;
import mg.rjc.stock.dto.CategorieSlimDto;
import mg.rjc.stock.model.CategorieEntity;

public interface CategorieMapper {
    CategorieGetDto fromEntity(CategorieEntity categorieEntity);
    CategorieEntity toEntity(CategoriePostDto categoriePostDto);
    CategorieEntity categorieSlimToEntity(CategorieSlimDto categorieSlimDto);

}
