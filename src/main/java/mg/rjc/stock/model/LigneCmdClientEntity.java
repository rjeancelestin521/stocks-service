package mg.rjc.stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ligne_cmd_clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class LigneCmdClientEntity extends AbstractEntity{

    @Column(name = "quantity")
    private BigDecimal quantity;

    @Column(name = "prix_unitaire")
    private BigDecimal prixUnitaire;

    @Column(name = "id_entreprise")
    private Long idEntreprise;

    @ManyToOne
    @JoinColumn(name = "id_article")
    private ArticleEntity article;

    @ManyToOne
    @JoinColumn(name = "id_commande_client")
    private CommandeClientEntity commandeClient;
}
