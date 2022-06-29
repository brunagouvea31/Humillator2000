package es.eoi.humillator2000.service;


import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.data.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService <Integer, Role, RoleRepository> {

    @Autowired
    public RoleService(RoleRepository repository) {
        super(repository);
    }
}
