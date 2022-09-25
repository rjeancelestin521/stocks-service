package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.LigneVenteGetDto;
import mg.rjc.stock.dto.LigneVentePostDto;
import mg.rjc.stock.model.LigneVenteEntity;

public interface LigneVenteMapper {
    LigneVenteGetDto fromEntity(LigneVenteEntity ligneVenteEntity);
    LigneVenteEntity toEntity(LigneVentePostDto ligneVentePostDto);
}
