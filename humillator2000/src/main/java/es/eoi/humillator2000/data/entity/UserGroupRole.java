package es.eoi.humillator2000.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_group_role")
public class UserGroupRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "userGroupRole")
    private Set<UserHasUserGroup> usersWithgroup;

    // GETTERS & SETTERS

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

    public Set<UserHasUserGroup> getUsersWithgroup() {
        return usersWithgroup;
    }

    public void setUsersWithgroup(Set<UserHasUserGroup> usersWithgroup) {
        this.usersWithgroup = usersWithgroup;
    }
}
