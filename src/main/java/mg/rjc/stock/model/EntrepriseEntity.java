package mg.rjc.stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "entreprises")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class EntrepriseEntity extends AbstractEntity{

    @Column(name = "nom")
    private String nom;

    @Column(name = "adresse")
    @Embedded
    private Adresse adresse;

    @Column(name = "description")
    private String description;

    @Column(name = "code_fiscal")
    private String codeFiscal;

    @Column(name = "photo")
    private String photo;

    @Column(name = "telephone")
    private String telephone;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "site_web")
    private String siteWeb;
}

