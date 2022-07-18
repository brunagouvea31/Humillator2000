package es.eoi.humillator2000.web.controller;


import es.eoi.humillator2000.data.entity.ClubRole;

import es.eoi.humillator2000.service.ClubRoleService;


import es.eoi.humillator2000.web.dto.ClubRoleDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/clubRole")
public class ClubRoleRestController {

    private final ClubRoleService clubRoleService;


    public ClubRoleRestController(ClubRoleService clubRoleService) {
        this.clubRoleService = clubRoleService;
    }

    @GetMapping
    public Page<ClubRoleDTO> findAll(Pageable pageable){
        return clubRoleService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ClubRoleDTO findById(@PathVariable("id") Integer id){
        return clubRoleService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        clubRoleService.deleteById(id);
    }

    @PostMapping
    public ClubRoleDTO save(ClubRoleDTO clubRoleDTO){
        return clubRoleService.save(clubRoleDTO);
    }

}
