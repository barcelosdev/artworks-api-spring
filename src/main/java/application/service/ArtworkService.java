package application.service;

import application.dto.ArtworkDTO;
import application.dto.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ArtworkService {

    public ArtworkDTO getArtwork(Integer id){
        return new RestTemplate().getForEntity("https://api.artic.edu/api/v1/artworks/"
                +id+"?fields=id,title,artist_titles,category_titles", ArtworkDTO.class).getBody();
    }
    public ArtworkDTO filter(String search){
        return new RestTemplate().getForEntity(
                "https://api.artic.edu/api/v1/artworks/search?q="
                        +search+"&fields=id,title,artist_titles,category_titles",
                                ArtworkDTO.class).getBody();
    }
}
