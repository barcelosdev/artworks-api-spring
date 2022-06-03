package application.dto;

import java.io.Serializable;

public class ArtworkDTO implements Serializable {

    private Integer id;
    private String title;
    private String artist_title;

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
        return artist_title;
    }
    public void setArtist(String artist_title) { this.artist_title = artist_title; }
}
