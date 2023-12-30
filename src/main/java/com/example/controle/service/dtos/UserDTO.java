package com.example.controle.service.dtos;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class UserDTO {

        private String name;
        private String email;
        private Date date_Naissance;
}
