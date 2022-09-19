package mg.rjc.stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ligne_ventes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LigneVenteEntity extends AbstractEntity{

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "id_entreprise")
    private Long idEntreprise;

    @ManyToOne
    @JoinColumn(name = "id_vente")
    private VenteEntity vente;

    @ManyToOne
    @JoinColumn(name = "id_article")
    private ArticleEntity article;
}
