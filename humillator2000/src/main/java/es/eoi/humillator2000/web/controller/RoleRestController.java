package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.RoleRepository;
import es.eoi.humillator2000.service.ClubService;
import es.eoi.humillator2000.service.RoleService;
import es.eoi.humillator2000.web.dto.RoleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
public class RoleRestController {

    private final RoleService roleService;

    public RoleRestController(RoleService roleService) {
        this.roleService = roleService;
    }


    @GetMapping
    public Page<RoleDTO> findAll(Pageable pageable){
        return roleService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public RoleDTO findById(@PathVariable("id") Integer id){
        return roleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        roleService.deleteById(id);
    }

    @PostMapping
    public RoleDTO save(RoleDTO roleDTO){
        return roleService.save(roleDTO);
    }
   }
