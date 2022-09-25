package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.ClientSlimDto;
import mg.rjc.stock.dto.CommandeClientGetDto;
import mg.rjc.stock.dto.CommandeClientPostDto;
import mg.rjc.stock.dto.CommandeClientSlimDto;
import mg.rjc.stock.mapper.ClientMapper;
import mg.rjc.stock.mapper.CommandeClientMapper;
import mg.rjc.stock.model.CommandeClientEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandeClientMapperImpl implements CommandeClientMapper {

    private final ClientMapper clientMapper;

    @Override
    public CommandeClientGetDto fromEntity(CommandeClientEntity commandeClientEntity) {
        if( commandeClientEntity == null ) return  null;
        return CommandeClientGetDto.builder()
                .id(commandeClientEntity.getId())
                .code(commandeClientEntity.getCode())
                .dateCommande(commandeClientEntity.getDateCommande())
                .etatCommande(commandeClientEntity.getEtatCommande())
                .idEntreprise(commandeClientEntity.getIdEntreprise())
                .client(clientMapper.fromEntity(commandeClientEntity.getClient())).build();
    }

    @Override
    public CommandeClientEntity toEntity(CommandeClientPostDto commandeClientPostDto) {
        if( commandeClientPostDto == null ) return null;
        CommandeClientEntity commandeClientEntity = new CommandeClientEntity();
        commandeClientEntity.setCode(commandeClientPostDto.getCode());
        commandeClientEntity.setDateCommande(commandeClientPostDto.getDateCommande());
        commandeClientEntity.setEtatCommande(commandeClientPostDto.getEtatCommande());
        commandeClientEntity.setIdEntreprise(commandeClientPostDto.getIdEntreprise());
        commandeClientEntity.setClient(clientMapper.clientSlimToEntity(commandeClientPostDto.getClient()));
        return commandeClientEntity;
    }

    @Override
    public CommandeClientEntity commandeClientSlimToEntity(CommandeClientSlimDto commandeClientSlimDto) {
        if( commandeClientSlimDto == null ) return null;
        CommandeClientEntity commandeClientEntity = new CommandeClientEntity();
        commandeClientEntity.setId(commandeClientSlimDto.getId());
        commandeClientEntity.setCode(commandeClientSlimDto.getCode());
        return commandeClientEntity;
    }
}
