package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.ClientGetDto;
import mg.rjc.stock.dto.ClientPostDto;
import mg.rjc.stock.dto.ClientSlimDto;
import mg.rjc.stock.mapper.AdresseMapper;
import mg.rjc.stock.mapper.ClientMapper;
import mg.rjc.stock.model.ClientEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClientMapperImpl implements ClientMapper {

    private final AdresseMapper adresseMapper;

    @Override
    public ClientGetDto fromEntity(ClientEntity clientEntity) {
        if(clientEntity == null) return null;
        return ClientGetDto.builder()
                .id(clientEntity.getId())
                .nom(clientEntity.getNom())
                .prenom(clientEntity.getPrenom())
                .email(clientEntity.getEmail())
                .telephone(clientEntity.getTelephone())
                .photo(clientEntity.getPhoto())
                .idEntreprise(clientEntity.getIdEntreprise())
                .adresse(adresseMapper.fromEntity(clientEntity.getAdresse()))
                .build();
    }

    @Override
    public ClientEntity toEntity(ClientPostDto clientPostDto) {
        if( clientPostDto == null ) return null;
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setNom(clientPostDto.getNom());
        clientEntity.setPrenom(clientPostDto.getPrenom());
        clientEntity.setPhoto(clientPostDto.getPhoto());
        clientEntity.setEmail(clientPostDto.getEmail());
        clientEntity.setTelephone(clientPostDto.getTelephone());
        clientEntity.setIdEntreprise(clientPostDto.getIdEntreprise());
        clientEntity.setAdresse(adresseMapper.toEntity(clientPostDto.getAdresse()));
        return clientEntity;
    }

    @Override
    public ClientEntity clientSlimToEntity(ClientSlimDto clientSlimDto) {
        if( clientSlimDto == null ) return null;
        ClientEntity clientEntity = new ClientEntity();
        clientEntity.setId(clientSlimDto.getId());
        clientEntity.setNom(clientSlimDto.getNom());
        clientEntity.setPrenom(clientSlimDto.getPrenom());
        clientEntity.setEmail(clientSlimDto.getEmail());
        return clientEntity;
    }
}
