package com.example.controle;

import com.example.controle.dao.entities.User;
import com.example.controle.dao.repositorise.UserRepositorise;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.Date;

@SpringBootApplication
public class ControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ControleApplication.class, args);
    }
    @Bean
    public CommandLineRunner commandLineRunner(UserRepositorise userRepositorise){
        return args -> {
            userRepositorise.save(User.builder().date_Naissance(new Date()).email("1@gmail.com").name("1").password("password1").build());
            userRepositorise.save(User.builder().date_Naissance(new Date()).email("2@gmail.com").name("2").password("password2").build());
            userRepositorise.save(User.builder().date_Naissance(new Date()).email("3@gmail.com").name("3").password("password3").build());
            userRepositorise.save(User.builder().date_Naissance(new Date()).email("4@gmail.com").name("4").password("password4").build());

        };
    }

}
