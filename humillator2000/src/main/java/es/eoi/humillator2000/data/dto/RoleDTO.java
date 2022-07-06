package es.eoi.humillator2000.data.dto;

import es.eoi.humillator2000.data.entity.User;

import java.util.Set;

public class RoleDTO {
    private Integer id;
    private String name;

    // EN LA DEMO NO | EL MAPPER ASIGNA ROLES AL MENU PERO NO A USUARIO??
    // ES PORQUE AL MOVER EL ROL NO ME INTERESA EL USUARIO??
    private Set<User> users;


}
