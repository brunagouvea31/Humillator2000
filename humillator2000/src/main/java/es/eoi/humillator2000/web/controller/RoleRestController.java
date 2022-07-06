package es.eoi.humillator2000.web.controller;

import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.service.RoleService;
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
    public List<Role> findAll(){
        return roleService.findAll();
    }

    @GetMapping("/{id}")
    public Role findById(@PathVariable("id") Integer id){
        return roleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        roleService.deleteById(id);
    }

    @PostMapping
    public Role save(Role role){
        return roleService.save(role);
    }
    @PutMapping
    public Role update(Role role){
        return roleService.update(role);
    }
}
