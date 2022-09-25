package mg.rjc.stock.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ClientSlimDto {
    private Long id;
    private String nom;
    private String prenom;
    private String email;
}
