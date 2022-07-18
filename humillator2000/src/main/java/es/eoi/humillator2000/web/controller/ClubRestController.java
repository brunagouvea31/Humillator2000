package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.IEntity;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.service.AbstractService;
import es.eoi.humillator2000.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/club")
public class ClubRestController extends AbstractRestController < ClubService,Club,Integer, ClubRepository>{


    protected ClubRestController(ClubService service) {
        super(service);
    }
}
