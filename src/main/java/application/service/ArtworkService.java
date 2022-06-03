package application.service;

import application.dto.ArtworkDTO;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ArtworkService {

    public ArtworkDTO getArtwork(Integer id){
        return new RestTemplate().getForEntity("https://api.artic.edu/api/v1/artworks/"
                +id+"?fields=id,title,artist_title", ArtworkDTO.class).getBody();
    }
    public List<ArtworkDTO> listAll(){
        ArtworkDTO[] artworkList = new RestTemplate().getForObject(
                "https://api.artic.edu/api/v1/artworks?fields=id,title,artist_title", ArtworkDTO[].class);
        return Arrays.asList(artworkList);
    }
}
