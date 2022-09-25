package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.CommandeClientGetDto;
import mg.rjc.stock.dto.CommandeClientPostDto;
import mg.rjc.stock.dto.CommandeClientSlimDto;
import mg.rjc.stock.model.CommandeClientEntity;

public interface CommandeClientMapper {
    CommandeClientGetDto fromEntity(CommandeClientEntity commandeClientEntity);
    CommandeClientEntity toEntity(CommandeClientPostDto commandeClientPostDto);
    CommandeClientEntity commandeClientSlimToEntity(CommandeClientSlimDto commandeClientSlimDto);
}
