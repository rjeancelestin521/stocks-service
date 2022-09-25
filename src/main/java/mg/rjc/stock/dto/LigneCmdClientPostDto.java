package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
public class LigneCmdClientPostDto {
    private BigDecimal quantity;
    private BigDecimal prixUnitaire;
    private Long idEntreprise;
    private ArticleSlimDto article;
    private CommandeClientSlimDto commandeClient;

}
