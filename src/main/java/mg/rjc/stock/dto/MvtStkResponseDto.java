package mg.rjc.stock.dto;

import lombok.*;
import mg.rjc.stock.model.ArticleEntity;
import mg.rjc.stock.model.SourceMvtStk;
import mg.rjc.stock.model.TypeMvtStk;

import java.math.BigDecimal;
import java.time.Instant;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MvtStkResponseDto {
    private Long id;
    private Instant dateMvtStk;
    private BigDecimal quantite;
    private TypeMvtStk typeMvtStk;
    private SourceMvtStk sourceMvtStk;
    private Long idEntreprise;
    private ArticleGetDto article;
}
