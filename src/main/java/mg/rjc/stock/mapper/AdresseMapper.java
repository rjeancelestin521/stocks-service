package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.AdresseDto;
import mg.rjc.stock.model.Adresse;

public interface AdresseMapper {
    AdresseDto fromEntity(Adresse adresse);
    Adresse toEntity(AdresseDto dto);
}
