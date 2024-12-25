package com.example.diplom.entities;

import com.example.diplom.enums.Role;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "USER")
public class User {

    @Id
    private Long id;
    private String username;
    private String password;
    private String email;
    private Role role;
    private LocalDateTime createdAt;
}
