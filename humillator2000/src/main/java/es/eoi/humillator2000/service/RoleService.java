package es.eoi.humillator2000.service;


import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.data.repository.RoleRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import es.eoi.humillator2000.service.mapper.RoleMapper;
import es.eoi.humillator2000.web.dto.RoleDTO;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService <Integer, Role, RoleRepository, RoleDTO, RoleMapper> {

    public RoleService(RoleRepository repository, RoleMapper mapper) {
        super(repository, mapper);
    }
}
