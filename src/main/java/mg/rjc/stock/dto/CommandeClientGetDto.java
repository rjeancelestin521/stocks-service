package mg.rjc.stock.dto;

import lombok.*;
import mg.rjc.stock.model.EtatCommande;

import java.time.Instant;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommandeClientGetDto {
    private Long id;
    private String code;
    private Instant dateCommande;
    private Long idEntreprise;
    private EtatCommande etatCommande;
    private ClientGetDto client;
}
