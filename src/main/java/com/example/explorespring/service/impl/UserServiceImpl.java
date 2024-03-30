package com.example.explorespring.service.impl;

import java.util.List;

import com.example.explorespring.dto.UserDto;
import com.example.explorespring.entity.User;
import com.example.explorespring.mapper.UserMapper;
import com.example.explorespring.repository.UserRepository;
import com.example.explorespring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDto> getAllUsers() {
        List<User> userList = (List<User>) userRepository.findAll();
        return userList.stream()
                .map(UserMapper.INSTANCE::userToUserDto)
                .toList();
    }
}
