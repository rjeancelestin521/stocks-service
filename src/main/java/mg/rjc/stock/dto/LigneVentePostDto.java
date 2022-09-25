package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class LigneVentePostDto {
    private BigDecimal quantite;
    private BigDecimal prixUnitaire;
    private Long idEntreprise;
    private VenteSlimDto vente;
    private ArticleSlimDto article;
}
