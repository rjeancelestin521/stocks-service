package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.ClientGetDto;
import mg.rjc.stock.dto.ClientPostDto;
import mg.rjc.stock.dto.ClientSlimDto;
import mg.rjc.stock.model.ClientEntity;

public interface ClientMapper {
    ClientGetDto fromEntity(ClientEntity clientEntity);
    ClientEntity toEntity(ClientPostDto clientPostDto);
    ClientEntity clientSlimToEntity(ClientSlimDto clientSlimDto);
}
