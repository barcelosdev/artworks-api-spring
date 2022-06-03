package application.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter @Setter
public class Data {
    @JsonAlias(value="id")
    private Integer id;
    @JsonAlias(value="title")
    private String title;
    @JsonAlias(value="artist_titles")
    private List<String> artist_titles;
    @JsonAlias(value="category_titles")
    private List<String> category_titles;
}
