package mg.rjc.stock.dto;

import lombok.*;
import mg.rjc.stock.model.Adresse;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UtilisateurGetDto {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private AdresseDto adresse;
    private String photo;
    private EntrepriseGetDto entreprise;
    private Collection<RoleGetDto> roles;
}
