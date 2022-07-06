package es.eoi.humillator2000.data.entity;

import javax.persistence.*;

@Entity
public class UserHasClub {

    @EmbeddedId
    private UserHasClubId id;

    private Float rating;

    @ManyToOne
    @JoinColumn(name = "club_ID")
    @MapsId("clubId")
    private Club club;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    @MapsId("userId")
    private User user;

    @ManyToOne
    @JoinColumn(name = "club_role_ID")
    @MapsId("roleId")
    private ClubRole clubRole;



    public UserHasClubId getId() {
        return id;
    }

    public void setId(UserHasClubId id) {
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

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public ClubRole getClubRole() {
        return clubRole;
    }

    public void setClubRole(ClubRole clubRole) {
        this.clubRole = clubRole;
    }
}
