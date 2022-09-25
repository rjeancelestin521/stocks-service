package mg.rjc.stock.dto;

import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class LigneVenteGetDto {
    private Long id;
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private Long idEntreprise;
    private VenteGetDto vente;
    private ArticleGetDto article;
}
