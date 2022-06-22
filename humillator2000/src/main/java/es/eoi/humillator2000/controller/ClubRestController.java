package es.eoi.humillator2000.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubRestController {
    private final ClubService clubService;

    @Autowired
    public ClubRestController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping
    public List<Club> findAll(){
       return clubService.findAll();
    }

    @GetMapping("/{id}")
    public Club findById(@PathVariable("id") Integer id){
        return clubService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        clubService.deleteById(id);
    }

    @PostMapping
    public Club save(Club club){
        return clubService.save(club);
    }
    @PutMapping
    public Club update(Club club){
        return clubService.update(club);
    }

}
