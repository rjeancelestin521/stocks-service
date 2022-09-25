package mg.rjc.stock.dto;


import lombok.*;

import java.math.BigDecimal;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ArticleGetDto {
    private Long id;
    private String codeArticle;
    private String designation;
    private BigDecimal prixUnitaireHT;
    private BigDecimal prixUnitaireTTC;
    private BigDecimal tauxTVA;
    private String photo;
    private EntrepriseGetDto entreprise;
    private CategorieGetDto categorie;
}
