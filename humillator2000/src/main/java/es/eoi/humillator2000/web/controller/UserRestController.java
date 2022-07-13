package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import es.eoi.humillator2000.service.ClubService;
import es.eoi.humillator2000.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController extends AbstractRestController<UserService, User,Integer, UserRepository>{


    protected UserRestController(UserService service) {
        super(service);
    }
}
