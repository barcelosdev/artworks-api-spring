package application.dto.attribute;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Data {
    private Integer id;
    private String title;
    private List<String> artist_titles;
    private List<String> category_titles;
}
