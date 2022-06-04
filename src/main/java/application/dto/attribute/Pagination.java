package application.dto.attribute;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Pagination {
    private Integer total;
    private Integer limit;
    private Integer total_pages;
    private Integer current_page;
}
