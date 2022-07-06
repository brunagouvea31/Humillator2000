package es.eoi.humillator2000.web.dto;

import java.util.Set;

public class UserDTO {
    private Integer id;
    private String login;

    //Transformar a blob??
    private byte[] avatar;
    private String email;

    // DEVUELVE DTOs no ENTIDAD
    private Set<RoleDTO> roles;
}
