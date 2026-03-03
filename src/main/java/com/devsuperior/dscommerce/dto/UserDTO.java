package com.devsuperior.dscommerce.dto;

import com.devsuperior.dscommerce.entities.User;
import org.springframework.security.core.GrantedAuthority;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UserDTO {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private LocalDate birthDate;

    List<String> roles = new ArrayList<>();

    public UserDTO(User entity) {
        birthDate = entity.getBirthDate();
        phone = entity.getPhone();
        email = entity.getEmail();
        name = entity.getName();
        id = entity.getId();
        for (GrantedAuthority role: entity.getRoles()) {
            roles.add(role.getAuthority());
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public List<String> getRoles() {
        return roles;
    }
}
