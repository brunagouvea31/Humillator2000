package es.eoi.humillator2000.service;


import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.repository.RoleRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService extends AbstractService <Integer, Role, RoleRepository> {
    private final UserRepository userRepository;

    private final RoleRepository roleRepository;

    @Autowired
    public RoleService(RoleRepository repository, UserRepository userRepository, RoleRepository roleRepository) {
        super(repository);
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

//    public void addUserRole (Integer id, Integer userId){
//
//        final User user = this.userRepository.findById(userId).orElseThrow(() -> new RuntimeException("No existe el id de usuario"));
//        final Role role= this.roleRepository.findById(id).orElseThrow(() -> new RuntimeException("No existe el rol"));
//
//        final Role role1= new Role();
//        userRole.setUsers(userRole);
//    }
}
