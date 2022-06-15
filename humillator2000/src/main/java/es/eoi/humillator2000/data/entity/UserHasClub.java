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
    private Club club;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    @MapsId("userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    @MapsId("userRoleId")
    private ClubRole clubRole;



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

    public Club getUserGroup() {
        return club;
    }

    public void setUserGroup(Club club) {
        this.club = club;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ClubRole getUserGroupRole() {
        return clubRole;
    }

    public void setUserGroupRole(ClubRole clubRole) {
        this.clubRole = clubRole;
    }
}
