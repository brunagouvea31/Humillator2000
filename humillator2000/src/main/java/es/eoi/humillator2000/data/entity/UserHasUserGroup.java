package es.eoi.humillator2000.data.entity;

import javax.persistence.*;

@Entity
public class UserHasUserGroup {

    @EmbeddedId
    private UserHasUserGroupId id;

    private Float rating;

    @ManyToOne
    @JoinColumn(name = "user_group_ID")
    @MapsId("userGroupId")
    private UserGroup userGroup;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    @MapsId("userId")
    private User user;

    // Se incluye en la key compuesta o separado como otra relacion??
    @ManyToOne
    private UserGroupRole userGroupRole;



    public UserHasUserGroupId getId() {
        return id;
    }

    public void setId(UserHasUserGroupId id) {
        this.id = id;
    }

    public Float getRating() {
        return rating;
    }

    public void setRating(Float rating) {
        this.rating = rating;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserGroupRole getUserGroupRole() {
        return userGroupRole;
    }

    public void setUserGroupRole(UserGroupRole userGroupRole) {
        this.userGroupRole = userGroupRole;
    }
}
