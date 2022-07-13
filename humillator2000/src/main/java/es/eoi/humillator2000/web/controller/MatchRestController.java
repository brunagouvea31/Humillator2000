package es.eoi.humillator2000.web.controller;


import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.MatchRepository;
import es.eoi.humillator2000.service.ClubService;
import es.eoi.humillator2000.service.MatchService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/match")
public class MatchRestController extends AbstractRestController<MatchService,Match,Integer, MatchRepository> {


    protected MatchRestController(MatchService service) {
        super(service);
    }
}
