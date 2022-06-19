package es.eoi.humillator2000.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_group_role")
public class ClubRole {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "clubRole")
    private Set<UserHasClub> usersWithgroup;

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

    public Set<UserHasClub> getUsersWithgroup() {
        return usersWithgroup;
    }

    public void setUsersWithgroup(Set<UserHasClub> usersWithgroup) {
        this.usersWithgroup = usersWithgroup;
    }
}
