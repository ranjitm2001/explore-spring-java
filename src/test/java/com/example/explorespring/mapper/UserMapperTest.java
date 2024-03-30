package com.example.explorespring.mapper;

import com.example.explorespring.dto.UserDto;
import com.example.explorespring.entity.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UserMapperTest {

    @Test
    void testMapperUserToUserDto() {
        UserDto userDto = UserDto.builder().id(1L).name("Ranjith M").age(28).build();
        User user = UserMapper.INSTANCE.userDtoToUser(userDto);

        assertNotNull(user);
        assertEquals(userDto.getId(), user.getId());
        assertEquals(userDto.getName(), user.getName());
        assertEquals(userDto.getAge(), user.getAge());

    }

    @Test
    void testMapperUserDtoToUser() {
        User user = User.builder().id(1L).name("Ranjith M").age(28).build();
        UserDto userDto = UserMapper.INSTANCE.userToUserDto(user);

        assertNotNull(userDto);
        assertEquals(user.getId(), userDto.getId());
        assertEquals(user.getName(), userDto.getName());
        assertEquals(user.getAge(), userDto.getAge());
    }
}