package application.controller;

import application.dto.ArtworkDTO;
import application.service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artworks")
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @ResponseBody
    @GetMapping("/getArtwork/{id}")
    public ResponseEntity<ArtworkDTO> getArtwork(@PathVariable("id") String id) {
        return new ResponseEntity<>(artworkService.getArtwork(Integer.parseInt(id)), HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/filter/{search}")
    public ResponseEntity<ArtworkDTO> filter(@PathVariable("search") String search){
        return new ResponseEntity<>(artworkService.filter(search), HttpStatus.OK);
    }

    @GetMapping("/filterPageLimit/{search}/{page}/{limit}")
    public ResponseEntity<ArtworkDTO> filterPageLimit
            (@PathVariable("search") String search, @PathVariable("page") Integer page, @PathVariable("limit") Integer limit)
    {
        return new ResponseEntity<>(artworkService.filterPageLimit(search, page, limit), HttpStatus.OK);
    }
}