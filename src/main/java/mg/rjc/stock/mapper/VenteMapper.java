package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.VenteGetDto;
import mg.rjc.stock.dto.VentePostDto;
import mg.rjc.stock.dto.VenteSlimDto;
import mg.rjc.stock.model.VenteEntity;

public interface VenteMapper {
    VenteGetDto fromEntity(VenteEntity venteEntity);
    VenteEntity toEntity(VentePostDto ventePostDto);
    VenteEntity venteSlimToEntity(VenteSlimDto venteSlimDto);
}
