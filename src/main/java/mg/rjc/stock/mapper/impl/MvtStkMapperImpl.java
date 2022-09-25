package mg.rjc.stock.mapper.impl;

import lombok.RequiredArgsConstructor;
import mg.rjc.stock.dto.MvtStkRequestDto;
import mg.rjc.stock.dto.MvtStkResponseDto;
import mg.rjc.stock.mapper.ArticleMapper;
import mg.rjc.stock.mapper.MvtStkMapper;
import mg.rjc.stock.model.MvtStkEntity;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class MvtStkMapperImpl implements MvtStkMapper {

    private final ArticleMapper articleMapper;

    @Override
    public MvtStkResponseDto mvtStkEntityToMvtStkResponseDto(MvtStkEntity mvtStkEntity) {
        if( mvtStkEntity == null ) return null;
        return MvtStkResponseDto.builder()
                .id(mvtStkEntity.getId())
                .dateMvtStk(mvtStkEntity.getDateMvtStk())
                .typeMvtStk(mvtStkEntity.getTypeMvtStk())
                .sourceMvtStk(mvtStkEntity.getSourceMvtStk())
                .quantite(mvtStkEntity.getQuantite())
                .idEntreprise(mvtStkEntity.getIdEntreprise())
                .article(articleMapper.fromEntity(mvtStkEntity.getArticle()))
                .build();
    }

    @Override
    public MvtStkEntity mvtStkRequestDtoToMvtStkEntity(MvtStkRequestDto mvtStkRequestDto) {
        if( mvtStkRequestDto == null ) return null;
        MvtStkEntity mvtStkEntity = new MvtStkEntity();
        mvtStkEntity.setDateMvtStk(Instant.now());
        mvtStkEntity.setQuantite(mvtStkRequestDto.getQuantite());
        mvtStkEntity.setTypeMvtStk(mvtStkRequestDto.getTypeMvtStk());
        mvtStkEntity.setSourceMvtStk(mvtStkRequestDto.getSourceMvtStk());
        mvtStkEntity.setIdEntreprise(mvtStkRequestDto.getIdEntreprise());
        mvtStkEntity.setArticle(articleMapper.articleSlimToEntity(mvtStkRequestDto.getArticle()));
        return mvtStkEntity;
    }
}
