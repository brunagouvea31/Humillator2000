package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.repository.RoleRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserService extends AbstractService<Integer, User, UserRepository> {

    private final UserRepository userRepository;

    private final RoleRepository roleRepository;


    @Autowired
    public UserService(UserRepository repository, UserRepository userRepository, RoleRepository roleRepository) {
        super(repository);
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    public void addRole(Integer id, Integer roleId) {

        final User user = this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("No existe el id de usuario"));
        final Set<Role> roles = this.roleRepository.findAll(roleId).orElseThrow(() -> new RuntimeException("No existe el rol"));

        final Role role1= new Role();
        userRole.setUsers(userRole);
        user.setRoles(role);
    }
}
