package mg.rjc.stock.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ArticleSlimDto {
    private Long id;
    private String codeArticle;
    private String designation;
}
