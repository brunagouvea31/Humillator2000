package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.service.MatchService;
import es.eoi.humillator2000.web.dto.MatchDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/match")
public class MatchRestController {

    private final MatchService matchService;

    public MatchRestController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public Page<MatchDTO> findAll(Pageable pageable){
        return matchService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public MatchDTO findById(@PathVariable("id") Integer id){
        return matchService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        matchService.deleteById(id);
    }

    @PostMapping
    public MatchDTO save(MatchDTO matchDTO){
        return matchService.save(matchDTO);
    }

}
