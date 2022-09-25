package mg.rjc.stock.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class FournisseurPostDto {
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String email;
    private String telephone;
    private String photo;
    private Long idEntreprise;
}
