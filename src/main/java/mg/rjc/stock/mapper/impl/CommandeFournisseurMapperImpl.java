package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.CommandeFournisseurGetDto;
import mg.rjc.stock.dto.CommandeFournisseurPostDto;
import mg.rjc.stock.dto.CommandeFournisseurSlimDto;
import mg.rjc.stock.mapper.CommandeFournisseurMapper;
import mg.rjc.stock.mapper.FournisseurMapper;
import mg.rjc.stock.model.CommandeFournisseurEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CommandeFournisseurMapperImpl implements CommandeFournisseurMapper {

    private final FournisseurMapper fournisseurMapper;

    @Override
    public CommandeFournisseurGetDto fromEntity(CommandeFournisseurEntity commandeFournisseurEntity) {
        if( commandeFournisseurEntity == null ) return null;
        return CommandeFournisseurGetDto.builder()
                .id(commandeFournisseurEntity.getId())
                .code(commandeFournisseurEntity.getCode())
                .dateCommande(commandeFournisseurEntity.getDateCommande())
                .etatCommande(commandeFournisseurEntity.getEtatCommande())
                .idEntreprise(commandeFournisseurEntity.getIdEntreprise())
                .fournisseur(fournisseurMapper.fromEntity(commandeFournisseurEntity.getFournisseur()))
                .build();
    }

    @Override
    public CommandeFournisseurEntity toEntity(CommandeFournisseurPostDto commandeFournisseurPostDto) {
        if( commandeFournisseurPostDto == null ) return null;
        CommandeFournisseurEntity commandeFournisseurEntity = new CommandeFournisseurEntity();
        commandeFournisseurEntity.setCode(commandeFournisseurPostDto.getCode());
        commandeFournisseurEntity.setDateCommande(commandeFournisseurPostDto.getDateCommande());
        commandeFournisseurEntity.setEtatCommande(commandeFournisseurPostDto.getEtatCommande());
        commandeFournisseurEntity.setIdEntreprise(commandeFournisseurPostDto.getIdEntreprise());
        commandeFournisseurEntity.setFournisseur(fournisseurMapper.fournisseurSlimToEntity(commandeFournisseurPostDto.getFournisseur()));
        return commandeFournisseurEntity;
    }

    @Override
    public CommandeFournisseurEntity commandeFournisseurSlimToEntity(CommandeFournisseurSlimDto commandeFournisseurSlimDto) {
        CommandeFournisseurEntity commandeFournisseurEntity = new CommandeFournisseurEntity();
        commandeFournisseurEntity.setId(commandeFournisseurSlimDto.getId());
        commandeFournisseurEntity.setCode(commandeFournisseurSlimDto.getCode());
        return commandeFournisseurEntity;
    }
}
