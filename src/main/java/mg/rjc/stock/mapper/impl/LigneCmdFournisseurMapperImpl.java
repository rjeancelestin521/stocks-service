package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.LigneCmdFournisseurGetDto;
import mg.rjc.stock.dto.LigneCmdFournisseurPostDto;
import mg.rjc.stock.mapper.ArticleMapper;
import mg.rjc.stock.mapper.CommandeFournisseurMapper;
import mg.rjc.stock.mapper.LigneCmdFournisseurMapper;
import mg.rjc.stock.model.LigneCmdFournisseurEntity;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LigneCmdFournisseurMapperImpl implements LigneCmdFournisseurMapper {

    private final ArticleMapper articleMapper;
    private final CommandeFournisseurMapper commandeFournisseurMapper;

    @Override
    public LigneCmdFournisseurGetDto fromEntity(LigneCmdFournisseurEntity ligneCmdFournisseurEntity) {
        if( ligneCmdFournisseurEntity == null ) return null;
        return LigneCmdFournisseurGetDto.builder()
                .id(ligneCmdFournisseurEntity.getId())
                .quantity(ligneCmdFournisseurEntity.getQuantity())
                .prixUnitaire(ligneCmdFournisseurEntity.getPrixUnitaire())
                .idEntreprise(ligneCmdFournisseurEntity.getIdEntreprise())
                .article(articleMapper.fromEntity(ligneCmdFournisseurEntity.getArticle()))
                .commandeFournisseur(commandeFournisseurMapper.fromEntity(ligneCmdFournisseurEntity.getCommandeFournisseur()))
                .build();
    }

    @Override
    public LigneCmdFournisseurEntity toEntity(LigneCmdFournisseurPostDto ligneCmdFournisseurPostDto) {
        if( ligneCmdFournisseurPostDto == null ) return null;
        LigneCmdFournisseurEntity ligneCmdFournisseurEntity = new LigneCmdFournisseurEntity();
        ligneCmdFournisseurEntity.setQuantity(ligneCmdFournisseurPostDto.getQuantity());
        ligneCmdFournisseurEntity.setPrixUnitaire(ligneCmdFournisseurPostDto.getPrixUnitaire());
        ligneCmdFournisseurEntity.setIdEntreprise(ligneCmdFournisseurPostDto.getIdEntreprise());
        ligneCmdFournisseurEntity.setArticle(articleMapper.articleSlimToEntity(ligneCmdFournisseurPostDto.getArticle()));
        ligneCmdFournisseurEntity.setCommandeFournisseur(
                commandeFournisseurMapper.commandeFournisseurSlimToEntity(
                        ligneCmdFournisseurPostDto.getCommandeFournisseur()
                )
        );
        return ligneCmdFournisseurEntity;
    }
}
