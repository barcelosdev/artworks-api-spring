package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table (name="artwork")
public class ArtworkDTO implements Serializable {

    @Id
    private Integer id;
    private String title;
    private String artist_titles;
    private String category_titles;

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) { this.id = id; }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist_titles;
    }
    public void setArtist(String artist) { this.artist_titles = artist; }
    public String getCategory() {
        return category_titles;
    }
    public void setCategory(String category) {
        this.category_titles = category;
    }
}
