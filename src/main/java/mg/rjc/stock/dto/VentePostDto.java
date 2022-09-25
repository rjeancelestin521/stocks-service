package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Setter
@Getter
public class VentePostDto {
    private String code;
    private Instant dateVente;
    private String commentaire;
    private Long idEntreprise;
}
