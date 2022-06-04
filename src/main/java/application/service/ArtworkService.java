package application.service;

import application.dto.ArtworkDTO;
import application.entity.QueryArtworks;
import application.repository.QueryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Service @Transactional
public class ArtworkService {

    @Autowired
    private QueryRepository queryRepository;

    public ArtworkDTO getArtwork(Integer id){
        this.queryRepository.save(new QueryArtworks("/getArtwork/"+String.valueOf(id), LocalDateTime.now()));
            return new RestTemplate().getForEntity("https://api.artic.edu/api/v1/artworks/"
                +id+"?fields=id,title,artist_titles,category_titles", ArtworkDTO.class).getBody();
    }
    public ArtworkDTO filter(String search){
        this.queryRepository.save(new QueryArtworks("/filter/"+search, LocalDateTime.now()));
        return new RestTemplate().getForEntity(
            "https://api.artic.edu/api/v1/artworks/search?q="
                +search+"&fields=id,title,artist_titles,category_titles",
                    ArtworkDTO.class).getBody();
    }
    public ArtworkDTO filterPageLimit(String search, Integer page, Integer limit){
        if(limit<=100){
            System.out.println("Limit of " + limit + " artworks per page is allowed");
        }else{
            System.out.println("Limit of " + limit + " artworks per page is not allowed");
            limit = 12;//Returns the default API limit
        }
        this.queryRepository.save(new QueryArtworks("/filterPageLimit/"+search+"/"+
                String.valueOf(page)+"/"+String.valueOf(limit), LocalDateTime.now()));
        return new RestTemplate().getForEntity(
                "https://api.artic.edu/api/v1/artworks/search?q="
                        +search+"&fields=id,title,artist_titles,category_titles"+"&page="+page+"&limit="+limit,
                ArtworkDTO.class).getBody();
    }
}
