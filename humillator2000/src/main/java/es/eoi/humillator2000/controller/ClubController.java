package es.eoi.humillator2000.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClubController {
    private final ClubService clubService;

    @Autowired
    public ClubController(ClubService clubService) {
        this.clubService = clubService;
    }

    @GetMapping("/club")
    public List<Club> findAll(){
       return clubService.findAll();
    }

    @GetMapping("/club/{id}")
    public Club findById(@PathVariable("id") Integer id){
        return clubService.findById(id);
    }
}
