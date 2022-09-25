package mg.rjc.stock.dto;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategoriePostDto {
    private String codeCategorie;
    private String designation;
    private Long idEntreprise;
}
