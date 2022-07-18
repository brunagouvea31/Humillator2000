package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.ClubRole;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.ClubRoleRepository;
import es.eoi.humillator2000.service.ClubRoleService;
import es.eoi.humillator2000.service.ClubService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clubRole")
public class ClubRoleRestController extends AbstractRestController<ClubRoleService, ClubRole,Integer, ClubRoleRepository> {


    protected ClubRoleRestController(ClubRoleService service) {
        super(service);
    }
}
