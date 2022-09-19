package mg.rjc.stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.Instant;

@Entity
@Table(name = "mvt_stks")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class MvtStkEntity extends AbstractEntity{

    @Column(name = "date_mvt_stk")
    private Instant dateMvtStk;

    @Column(name = "quantite")
    private BigDecimal quantite;

    @Column(name = "type_mvt_stk")
    private TypeMvtStk typeMvtStk;

    @Column(name = "source_mvt_stk")
    private SourceMvtStk sourceMvtStk;

    @Column(name = "id_entreprise")
    private Long idEntreprise;

    @ManyToOne
    @JoinColumn(name = "id_article")
    private ArticleEntity article;
}
