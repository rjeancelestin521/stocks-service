package mg.rjc.stock.mapper.impl;

import mg.rjc.stock.dto.AdresseDto;
import mg.rjc.stock.mapper.AdresseMapper;
import mg.rjc.stock.model.Adresse;
import org.springframework.stereotype.Component;

@Component
public class AdresseMapperImpl implements AdresseMapper {

    @Override
    public AdresseDto fromEntity(Adresse adresse) {
        if( adresse == null ) return null;
        return AdresseDto.builder()
                .adresse1(adresse.getAdresse1() )
                .adresse2(adresse.getAdresse2() )
                .codePostale(adresse.getCodePostale() )
                .ville( adresse.getVille() )
                .pays(adresse.getPays() )
                .build();
    }

    @Override
    public Adresse toEntity(AdresseDto dto) {
        if( dto == null ) return null;
        Adresse adresse = new Adresse();
        adresse.setAdresse1(dto.getAdresse1() );
        adresse.setAdresse2(dto.getAdresse2());
        adresse.setVille(dto.getVille() );
        adresse.setCodePostale(dto.getCodePostale() );
        adresse.setPays(dto.getPays() );
        return adresse;
    }
}
