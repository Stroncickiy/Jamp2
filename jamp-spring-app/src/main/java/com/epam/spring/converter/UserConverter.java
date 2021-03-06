package com.epam.spring.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.epam.spring.model.User;
import com.epam.spring.service.UserService;

@Component
public class UserConverter implements Converter<String, User> {
    @Autowired
    private UserService userService;

    @Override
    public User convert(String id) {
        return userService.getById(Long.valueOf(id));
    }
}
