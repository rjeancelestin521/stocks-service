package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.LigneCmdClientGetDto;
import mg.rjc.stock.dto.LigneCmdClientPostDto;
import mg.rjc.stock.mapper.ArticleMapper;
import mg.rjc.stock.mapper.CommandeClientMapper;
import mg.rjc.stock.mapper.LigneCmdClientMapper;
import mg.rjc.stock.model.LigneCmdClientEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LigneCmdClientMapperImpl implements LigneCmdClientMapper {

    private final ArticleMapper articleMapper;
    private final CommandeClientMapper commandeClientMapper;

    @Override
    public LigneCmdClientGetDto fromEntity(LigneCmdClientEntity ligneCmdClientEntity) {
        if( ligneCmdClientEntity == null ) return null;
        return LigneCmdClientGetDto.builder()
                .id(ligneCmdClientEntity.getId())
                .quantity(ligneCmdClientEntity.getQuantity())
                .prixUnitaire(ligneCmdClientEntity.getPrixUnitaire())
                .idEntreprise(ligneCmdClientEntity.getIdEntreprise())
                .article(articleMapper.fromEntity(ligneCmdClientEntity.getArticle()))
                .commandeClient(commandeClientMapper.fromEntity(ligneCmdClientEntity.getCommandeClient()))
                .build();
    }

    @Override
    public LigneCmdClientEntity toEntity(LigneCmdClientPostDto ligneCmdClientPostDto) {
        if( ligneCmdClientPostDto == null ) return null;
        LigneCmdClientEntity ligneCmdClientEntity = new LigneCmdClientEntity();
        ligneCmdClientEntity.setQuantity(ligneCmdClientPostDto.getQuantity());
        ligneCmdClientEntity.setPrixUnitaire(ligneCmdClientPostDto.getPrixUnitaire());
        ligneCmdClientEntity.setIdEntreprise(ligneCmdClientPostDto.getIdEntreprise());
        ligneCmdClientEntity.setArticle(articleMapper.articleSlimToEntity(ligneCmdClientPostDto.getArticle()));
        ligneCmdClientEntity.setCommandeClient(commandeClientMapper.commandeClientSlimToEntity(ligneCmdClientPostDto.getCommandeClient()));
        return ligneCmdClientEntity;
    }
}
