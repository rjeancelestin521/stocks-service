package mg.rjc.stock.dto;

import lombok.*;

import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VenteGetDto {
    private Long id;
    private String code;
    private Instant dateVente;
    private String commentaire;
    private Long idEntreprise;
}
