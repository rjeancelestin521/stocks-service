package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.CommandeFournisseurGetDto;
import mg.rjc.stock.dto.CommandeFournisseurPostDto;
import mg.rjc.stock.dto.CommandeFournisseurSlimDto;
import mg.rjc.stock.model.CommandeFournisseurEntity;

public interface CommandeFournisseurMapper {
    CommandeFournisseurGetDto fromEntity(CommandeFournisseurEntity commandeFournisseurEntity);
    CommandeFournisseurEntity toEntity(CommandeFournisseurPostDto commandeFournisseurPostDto);
    CommandeFournisseurEntity commandeFournisseurSlimToEntity(CommandeFournisseurSlimDto commandeFournisseurSlimDto);
}
