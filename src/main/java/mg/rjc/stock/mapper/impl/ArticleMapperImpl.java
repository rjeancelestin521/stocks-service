package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.ArticleGetDto;
import mg.rjc.stock.dto.ArticlePostDto;
import mg.rjc.stock.dto.ArticleSlimDto;
import mg.rjc.stock.mapper.ArticleMapper;
import mg.rjc.stock.mapper.CategorieMapper;
import mg.rjc.stock.mapper.EntrepriseMapper;
import mg.rjc.stock.model.ArticleEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ArticleMapperImpl implements ArticleMapper {

    private final CategorieMapper categorieMapper;
    private final EntrepriseMapper entrepriseMapper;

    @Override
    public ArticleGetDto fromEntity(ArticleEntity articleEntity) {
        if( articleEntity == null ) return null;
        return ArticleGetDto.builder()
                .id(articleEntity.getId())
                .codeArticle(articleEntity.getCodeArticle())
                .designation(articleEntity.getDesignation())
                .prixUnitaireHT(articleEntity.getPrixUnitaireHT())
                .prixUnitaireTTC(articleEntity.getPrixUnitaireTTC())
                .tauxTVA(articleEntity.getTauxTVA())
                .photo(articleEntity.getPhoto())
                .categorie(categorieMapper.fromEntity(articleEntity.getCategorie()))
                .entreprise(entrepriseMapper.fromEntity(articleEntity.getEntreprise()))
                .build();
    }

    @Override
    public ArticleEntity toEntity(ArticlePostDto articlePostDto) {
        if( articlePostDto ==null ) return null;
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setCodeArticle(articlePostDto.getCodeArticle());
        articleEntity.setDesignation(articlePostDto.getDesignation());
        articleEntity.setPrixUnitaireHT(articlePostDto.getPrixUnitaireHT());
        articleEntity.setPrixUnitaireTTC(articlePostDto.getPrixUnitaireTTC());
        articleEntity.setTauxTVA(articlePostDto.getTauxTVA());
        articleEntity.setPhoto(articlePostDto.getPhoto());
        articleEntity.setEntreprise(entrepriseMapper.entrepriseSlimToEntity(articlePostDto.getEntreprise()));
        articleEntity.setCategorie(categorieMapper.categorieSlimToEntity(articlePostDto.getCategorie()));
        return articleEntity;
    }

    @Override
    public ArticleEntity articleSlimToEntity(ArticleSlimDto articleSlimDto) {
        if( articleSlimDto == null ) return null;
        ArticleEntity articleEntity = new ArticleEntity();
        articleEntity.setId(articleSlimDto.getId());
        articleEntity.setCodeArticle(articleSlimDto.getCodeArticle());
        articleEntity.setDesignation(articleSlimDto.getDesignation());
        return articleEntity;
    }
}
