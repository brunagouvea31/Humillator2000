package es.eoi.humillator2000.data.dto;

import es.eoi.humillator2000.data.entity.Role;

import java.sql.Blob;
import java.util.Set;

public class UserDTO {
    private Integer id;
    private String login;
    private String password;

    // Blob o String??
    private Blob avatar;
    private String email;

    private Set<Role> roles;
}
