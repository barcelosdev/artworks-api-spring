package controller;

import dto.ArtworkDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import service.ArtworkService;

@RestController
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @ResponseBody
    @GetMapping(value="**/getArtwork/{id}")
    public ResponseEntity<ArtworkDTO> getArtwork(@PathVariable("id") Integer id){

        ArtworkDTO artworkDTO = artworkService.getArtwork(id);
        return new ResponseEntity<ArtworkDTO>(artworkDTO, HttpStatus.OK);
    }
}