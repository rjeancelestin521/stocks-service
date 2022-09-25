package mg.rjc.stock.mapper;

import mg.rjc.stock.dto.ArticleGetDto;
import mg.rjc.stock.dto.ArticlePostDto;
import mg.rjc.stock.dto.ArticleSlimDto;
import mg.rjc.stock.model.ArticleEntity;

public interface ArticleMapper {
    ArticleGetDto fromEntity(ArticleEntity articleEntity);
    ArticleEntity toEntity(ArticlePostDto articlePostDto);
    ArticleEntity articleSlimToEntity(ArticleSlimDto articleSlimDto);
}
