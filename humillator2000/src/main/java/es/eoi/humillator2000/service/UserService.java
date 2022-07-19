package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.repository.RoleRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import es.eoi.humillator2000.data.repository.UserMapper;
import es.eoi.humillator2000.web.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<Integer, User, UserRepository, UserDTO, UserMapper> {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    public UserService(UserRepository repository, UserMapper mapper, UserRepository userRepository, RoleRepository roleRepository) {
        super(repository, mapper);
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
}
