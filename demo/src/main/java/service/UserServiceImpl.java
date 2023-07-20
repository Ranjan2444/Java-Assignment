package service;

import dto.UserDto;
import entity.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByUsername(String username) {

        return userRepository.findByUsername(username);
    }

    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getUsername(), userDto.getPassword(), userDto.getEmail());
        return userRepository.save(null);
    }
}
