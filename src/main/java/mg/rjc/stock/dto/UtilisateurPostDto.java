package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;
import mg.rjc.stock.model.Adresse;

@Setter
@Getter
public class UtilisateurPostDto {
    private String nom;
    private String prenom;
    private String email;
    private String motDePasse;
    private String confirmMotDePasse;
    private String telephone;
    private AdresseDto adresse;
    private String photo;
    private EntrepriseSlimDto entreprise;
}
