package mg.rjc.stock.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ClientGetDto {
    private Long id;
    private String nom;
    private String prenom;
    private AdresseDto adresse;
    private String email;
    private String telephone;
    private String photo;
    private Long idEntreprise;
}
