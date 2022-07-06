package es.eoi.humillator2000.data.dto;

import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.data.entity.UserHasClub;

import java.util.Set;

public class ClubRoleDTO {
    private Integer id;
    private String name;
    private Set<UserHasClub> usersWithgroup;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UserHasClub> getUsersWithgroup() {
        return usersWithgroup;
    }

    public void setUsersWithgroup(Set<UserHasClub> usersWithgroup) {
        this.usersWithgroup = usersWithgroup;
    }
}
