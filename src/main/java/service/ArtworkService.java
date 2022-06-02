package service;

import dto.ArtworkDTO;
import org.springframework.web.client.RestTemplate;

public class ArtworkService {

    public String url = "https://api.artic.edu/api/v1/artworks/";

    public ArtworkDTO getArtwork(Integer id){
        return new RestTemplate().getForEntity(url+id, ArtworkDTO.class).getBody();
    }
}
