package com.example.controle.service;

import com.example.controle.service.dtos.UserDTO;

public interface UserManager {
    UserDTO getUserByEmail(String email);
    UserDTO getUserByDateNaissance(String date);
    UserDTO saveUser(UserDTO userDTO);
    UserDTO deleteUser(Long id);

}
