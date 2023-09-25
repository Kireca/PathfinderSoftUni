package softuni.pathfindersoftuni.service.impl;

import org.springframework.stereotype.Service;
import softuni.pathfindersoftuni.model.User;
import softuni.pathfindersoftuni.repository.UserRepository;
import softuni.pathfindersoftuni.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
