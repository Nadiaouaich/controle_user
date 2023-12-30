package com.example.controle.service;

import com.example.controle.dao.repositorise.UserRepositorise;
import com.example.controle.service.dtos.UserDTO;
import com.example.controle.service.mappers.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class UserManagerAction implements UserManager {

    @Autowired
    private UserRepositorise userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDTO getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserDTO getUserByDateNaissance(String date) {
        return null;
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        return null;
    }

    @Override
    public UserDTO deleteUser(Long id) {
        return null;
    }
}
