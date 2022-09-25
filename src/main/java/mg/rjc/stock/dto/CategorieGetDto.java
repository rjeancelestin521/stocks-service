package mg.rjc.stock.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import mg.rjc.stock.model.CategorieEntity;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CategorieGetDto {

    private Long id;
    private String codeCategorie;
    private String designation;
    private Long idEntreprise;

    public static CategorieGetDto fromEntity(CategorieEntity entity) {
        if( entity == null ) return null;
        return CategorieGetDto.builder()
                .id(entity.getId())
                .codeCategorie(entity.getCodeCategorie())
                .designation(entity.getDesignation())
                .idEntreprise(entity.getIdEntreprise())
                .build();
    }

    public static CategorieEntity toEntity(CategorieGetDto dto){
        if( dto ==null ) return null;
        CategorieEntity entity = new CategorieEntity();
        entity.setCodeCategorie(dto.getCodeCategorie());
        entity.setDesignation(dto.getDesignation());
        entity.setIdEntreprise(dto.getIdEntreprise());
        return entity;
    }
}
