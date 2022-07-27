package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.repository.RoleRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import es.eoi.humillator2000.service.mapper.UserMapper;
import es.eoi.humillator2000.web.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<Integer, User, UserRepository, UserDTO, UserMapper> {


    public UserService(UserRepository repository, UserMapper mapper, UserRepository userRepository, RoleRepository roleRepository) {
        super(repository, mapper);
    }
}
