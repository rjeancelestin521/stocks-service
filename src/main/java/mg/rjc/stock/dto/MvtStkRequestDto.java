package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;
import mg.rjc.stock.model.SourceMvtStk;
import mg.rjc.stock.model.TypeMvtStk;

import java.math.BigDecimal;

@Setter
@Getter
public class MvtStkRequestDto {
    private BigDecimal quantite;
    private TypeMvtStk typeMvtStk;
    private SourceMvtStk sourceMvtStk;
    private Long idEntreprise;
    private ArticleSlimDto article;
}
