package application.controller;

import application.dto.ArtworkDTO;
import application.service.ArtworkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/artwork")
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @ResponseBody
    @GetMapping("/getArtwork/{id}")
    public ResponseEntity<ArtworkDTO> getArtwork(@PathVariable("id") String id) {
        return new ResponseEntity<>(artworkService.getArtwork(Integer.parseInt(id)), HttpStatus.OK);
    }

    @ResponseBody
    @GetMapping("/listAll")
    public List<ArtworkDTO> listAll(){
        return artworkService.listAll();
    }
}