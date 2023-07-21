package service;

import dto.UserDto;
import entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findByUsername(String username);
    User save(UserDto userDto);

}
