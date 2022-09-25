package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.FournisseurGetDto;
import mg.rjc.stock.dto.FournisseurPostDto;
import mg.rjc.stock.dto.FournisseurSlimDto;
import mg.rjc.stock.model.FournisseurEntity;

public interface FournisseurMapper {
    FournisseurGetDto fromEntity(FournisseurEntity fournisseurEntity);
    FournisseurEntity toEntity(FournisseurPostDto fournisseurPostDto);
    FournisseurEntity fournisseurSlimToEntity(FournisseurSlimDto fournisseurSlimDto);
}
