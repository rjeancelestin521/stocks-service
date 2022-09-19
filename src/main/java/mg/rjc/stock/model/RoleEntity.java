package mg.rjc.stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "roles")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class RoleEntity extends AbstractEntity{

    @Column(name = "role_name")
    private String roleName;

    @ManyToOne
    @JoinColumn(name = "id_utilisateur")
    private UtilisateurEntity utilisateur;
}
