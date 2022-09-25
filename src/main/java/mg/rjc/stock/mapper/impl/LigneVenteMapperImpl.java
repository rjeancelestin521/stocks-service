package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.LigneVenteGetDto;
import mg.rjc.stock.dto.LigneVentePostDto;
import mg.rjc.stock.mapper.ArticleMapper;
import mg.rjc.stock.mapper.LigneVenteMapper;
import mg.rjc.stock.mapper.VenteMapper;
import mg.rjc.stock.model.LigneVenteEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LigneVenteMapperImpl implements LigneVenteMapper {

    private final ArticleMapper articleMapper;
    private final VenteMapper venteMapper;

    @Override
    public LigneVenteGetDto fromEntity(LigneVenteEntity ligneVenteEntity) {
        if(ligneVenteEntity == null) return null;
        return LigneVenteGetDto.builder()
                .id(ligneVenteEntity.getId())
                .quantite(ligneVenteEntity.getQuantite())
                .prixUnitaire(ligneVenteEntity.getPrixUnitaire())
                .idEntreprise(ligneVenteEntity.getIdEntreprise())
                .article(articleMapper.fromEntity(ligneVenteEntity.getArticle()))
                .vente(venteMapper.fromEntity(ligneVenteEntity.getVente()))
                .build();
    }

    @Override
    public LigneVenteEntity toEntity(LigneVentePostDto ligneVentePostDto) {
        if(ligneVentePostDto == null) return null;
        LigneVenteEntity ligneVenteEntity = new LigneVenteEntity();
        ligneVenteEntity.setQuantite(ligneVentePostDto.getQuantite());
        ligneVenteEntity.setPrixUnitaire(ligneVentePostDto.getPrixUnitaire());
        ligneVenteEntity.setIdEntreprise(ligneVentePostDto.getIdEntreprise());
        ligneVenteEntity.setArticle(articleMapper.articleSlimToEntity(ligneVentePostDto.getArticle()));
        ligneVenteEntity.setVente(venteMapper.venteSlimToEntity(ligneVentePostDto.getVente()));
        return ligneVenteEntity;
    }
}
