package es.eoi.humillator2000.data.entity;

import javax.persistence.*;
import java.sql.Blob;
import java.util.Set;

@Entity
@Table(name = "humillator_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String password;

    // BLOB??
    private Blob avatar;

    private String email;

    @ManyToMany
    @JoinTable(
            name = "user_has_role",
            joinColumns = @JoinColumn(name = "user_ID"),
            inverseJoinColumns = @JoinColumn(name = "user_role_ID"))
    private Set<Role> roles;



    // GETTERS & SETTERS
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Blob getAvatar() {
        return avatar;
    }

    public void setAvatar(Blob avatar) {
        this.avatar = avatar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<Role> getUserRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = this.roles;
    }
}