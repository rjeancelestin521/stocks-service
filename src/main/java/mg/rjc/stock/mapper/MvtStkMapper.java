package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.MvtStkRequestDto;
import mg.rjc.stock.dto.MvtStkResponseDto;
import mg.rjc.stock.model.MvtStkEntity;

public interface MvtStkMapper {
    MvtStkResponseDto mvtStkEntityToMvtStkResponseDto(MvtStkEntity mvtStkEntity);
    MvtStkEntity mvtStkRequestDtoToMvtStkEntity(MvtStkRequestDto mvtStkRequestDto);
}
