package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import es.eoi.humillator2000.service.ClubService;
import es.eoi.humillator2000.service.UserService;
import es.eoi.humillator2000.web.dto.UserDTO;
import org.apache.catalina.UserDatabase;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public Page<UserDTO> findAll(Pageable pageable){
        return userService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public UserDTO findById(@PathVariable("id") Integer id){
        return userService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        userService.deleteById(id);
    }

    @PostMapping
    public UserDTO save(UserDTO userDTO){
        return userService.save(userDTO);
    }

}
