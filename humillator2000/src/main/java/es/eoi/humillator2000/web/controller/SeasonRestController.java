package es.eoi.humillator2000.web.controller;


import es.eoi.humillator2000.service.SeasonService;
import es.eoi.humillator2000.web.dto.SeasonDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/season")
public class SeasonRestController {

    private final SeasonService seasonService;


    public SeasonRestController(SeasonService seasonService) {
        this.seasonService = seasonService;
    }

    @GetMapping
    public Page<SeasonDTO> findAll(Pageable pageable){
        return seasonService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public SeasonDTO findById(@PathVariable("id") Integer id){
        return seasonService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        seasonService.deleteById(id);
    }

    @PostMapping
    public SeasonDTO save(SeasonDTO seasonDTO){
        return seasonService.save(seasonDTO);
    }

}
