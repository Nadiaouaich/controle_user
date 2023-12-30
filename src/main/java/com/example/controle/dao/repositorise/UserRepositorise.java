package com.example.controle.dao.repositorise;

import com.example.controle.dao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepositorise extends JpaRepository<User,Long> {

}
