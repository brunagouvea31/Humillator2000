package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.RoleRepository;
import es.eoi.humillator2000.service.ClubService;
import es.eoi.humillator2000.service.RoleService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleRestController extends AbstractRestController<RoleService, Role,Integer, RoleRepository>{


    protected RoleRestController(RoleService service) {
        super(service);
    }
}
