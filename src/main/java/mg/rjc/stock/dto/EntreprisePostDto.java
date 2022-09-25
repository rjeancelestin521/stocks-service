package mg.rjc.stock.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EntreprisePostDto {
    private String nom;
    private AdresseDto adresse;
    private String description;
    private String codeFiscal;
    private String photo;
    private String telephone;
    private String email;
    private String siteWeb;
}
