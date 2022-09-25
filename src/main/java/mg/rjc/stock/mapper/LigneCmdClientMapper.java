package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.LigneCmdClientGetDto;
import mg.rjc.stock.dto.LigneCmdClientPostDto;
import mg.rjc.stock.model.LigneCmdClientEntity;

public interface LigneCmdClientMapper {
    LigneCmdClientGetDto fromEntity(LigneCmdClientEntity ligneCmdClientEntity);
    LigneCmdClientEntity toEntity(LigneCmdClientPostDto ligneCmdClientPostDto);
}
