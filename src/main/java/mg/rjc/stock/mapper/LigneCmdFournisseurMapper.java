package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.LigneCmdFournisseurGetDto;
import mg.rjc.stock.dto.LigneCmdFournisseurPostDto;
import mg.rjc.stock.model.LigneCmdFournisseurEntity;

public interface LigneCmdFournisseurMapper {
    LigneCmdFournisseurGetDto fromEntity(LigneCmdFournisseurEntity ligneCmdFournisseurEntity);
    LigneCmdFournisseurEntity toEntity(LigneCmdFournisseurPostDto ligneCmdFournisseurPostDto);
}
