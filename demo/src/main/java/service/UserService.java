package service;

import dto.UserDto;
import entity.User;

public interface UserService {

    User findByUsername(String username);
    User save(UserDto userDto);

}
