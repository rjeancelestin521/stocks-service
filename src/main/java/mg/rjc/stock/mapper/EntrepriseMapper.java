package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.EntrepriseGetDto;
import mg.rjc.stock.dto.EntreprisePostDto;
import mg.rjc.stock.dto.EntrepriseSlimDto;
import mg.rjc.stock.model.EntrepriseEntity;

public interface EntrepriseMapper {
    EntrepriseGetDto fromEntity(EntrepriseEntity entrepriseEntity);
    EntrepriseEntity toEntity(EntreprisePostDto entreprisePostDto);
    EntrepriseEntity entrepriseSlimToEntity(EntrepriseSlimDto entrepriseSlimDto);
}
