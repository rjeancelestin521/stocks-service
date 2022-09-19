package mg.rjc.stock.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "categories")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class CategorieEntity extends AbstractEntity {

    @Column(name = "code_categorie")
    private String codeCategorie;

    @Column(name = "designation")
    private String designation;

    @Column(name = "id_entreprise")
    private Long idEntreprise;

    @OneToMany(mappedBy = "categorie")
    private Collection<ArticleEntity> articles;
}
