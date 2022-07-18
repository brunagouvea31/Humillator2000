package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Season;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.SeasonRepository;
import es.eoi.humillator2000.service.ClubService;
import es.eoi.humillator2000.service.SeasonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/season")
public class SeasonRestController extends AbstractRestController <SeasonService, Season,Integer, SeasonRepository>{


    protected SeasonRestController(SeasonService service) {
        super(service);
    }
}
