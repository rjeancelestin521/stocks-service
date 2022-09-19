package mg.rjc.stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class ClientEntity extends AbstractEntity {

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "adresse")
    @Embedded
    private Adresse adresse;

    @Column(name = "email")
    private String email;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "photo")
    private String photo;

    @Column(name = "id_entreprise")
    private Long idEntreprise;

    @OneToMany(mappedBy = "client")
    private Collection<CommandeClientEntity> commandeClients;
}
