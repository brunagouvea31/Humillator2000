package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.ClubRole;
import es.eoi.humillator2000.data.repository.ClubRoleRepository;
import es.eoi.humillator2000.service.mapper.ClubRoleMapper;
import es.eoi.humillator2000.web.dto.ClubRoleDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClubRoleService extends AbstractService<Integer, ClubRole, ClubRoleRepository, ClubRoleDTO, ClubRoleMapper> {


    public ClubRoleService(ClubRoleRepository repository, ClubRoleMapper mapper) {
        super(repository, mapper);
    }
}
