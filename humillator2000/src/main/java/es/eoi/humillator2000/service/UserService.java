package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<Integer, User, UserRepository> {

    @Autowired
    public UserService(UserRepository repository) {
        super(repository);
    }
}
