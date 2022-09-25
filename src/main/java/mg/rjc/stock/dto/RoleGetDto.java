package mg.rjc.stock.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class RoleGetDto {
    private Long id;
    private String roleName;
    private UtilisateurGetDto utilisateur;
}
