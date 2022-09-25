package mg.rjc.stock.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ArticlePostDto {
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHT;
    private BigDecimal prixUnitaireTTC;
    private BigDecimal tauxTVA;
    private String photo;
    private EntrepriseSlimDto entreprise;
    private CategorieSlimDto categorie;
}
