package mg.rjc.stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "articles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ArticleEntity extends AbstractEntity{

    @Column(name = "code_article")
    private String codeArticle;

    @Column(name = "designation")
    private String designation;

    @Column(name = "prix_unitaire_ht")
    private BigDecimal prixUnitaireHT;

    @Column(name = "prix_unitaire_ttc")
    private BigDecimal prixUnitaireTTC;

    @Column(name = "taux_tva")
    private BigDecimal tauxTVA;

    @Column(name = "photo")
    private String photo;

    @ManyToOne
    @JoinColumn(name = "id_entreprise")
    private EntrepriseEntity entreprise;

    @ManyToOne
    @JoinColumn(name = "id_categorie")
    private CategorieEntity categorie;
}
