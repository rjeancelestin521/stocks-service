package mg.rjc.stock.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FournisseurGetDto {
    private Long id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String email;
    private String telephone;
    private String photo;
    private Long idEntreprise;
}
