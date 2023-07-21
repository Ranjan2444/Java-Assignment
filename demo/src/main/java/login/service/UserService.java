package login.service;

import login.dto.UserDto;
import login.model.User;

public interface UserService {

    User findByUsername(String username);
    User save(UserDto userDto);
}
