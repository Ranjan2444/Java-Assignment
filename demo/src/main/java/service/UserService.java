package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.dto.UserDto;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findByUsername(String username);
    User save(UserDto userDto);

}
