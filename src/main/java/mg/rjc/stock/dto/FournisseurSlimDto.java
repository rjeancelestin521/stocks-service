package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class FournisseurSlimDto {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}
