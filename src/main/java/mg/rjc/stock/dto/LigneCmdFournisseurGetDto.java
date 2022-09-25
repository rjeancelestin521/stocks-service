package mg.rjc.stock.dto;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LigneCmdFournisseurGetDto {
    private Long id;
    private BigDecimal quantity;
    private BigDecimal prixUnitaire;
    private Long idEntreprise;
    private ArticleGetDto article;
    private CommandeFournisseurGetDto commandeFournisseur;
}
