package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;
import mg.rjc.stock.model.EtatCommande;

import java.time.Instant;

@Setter
@Getter
public class CommandeFournisseurPostDto {
    private String code;
    private Instant dateCommande;
    private Long idEntreprise;
    private EtatCommande etatCommande;
    private FournisseurSlimDto fournisseur;
}
