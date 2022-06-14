package es.eoi.humillator2000.data.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user_has_match")
public class UserHasMatch {
    @EmbeddedId
    private UserHasMatchId id;

    private Boolean isOwner;
    private Integer mark;

    // Match User Group ID??

    @ManyToOne
    @JoinColumn(name = "match_ID")
    @MapsId("matchId")
    private Match match;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    @MapsId("userId")
    private User user;

    @OneToMany(mappedBy = "userHasMatch")
    private Set<Notification> notifications;


    public UserHasMatchId getId() {
        return id;
    }

    public void setId(UserHasMatchId id) {
        this.id = id;
    }

    public Boolean getOwner() {
        return isOwner;
    }

    public void setOwner(Boolean owner) {
        isOwner = owner;
    }

    public Integer getMark() {
        return mark;
    }

    public void setMark(Integer mark) {
        this.mark = mark;
    }

    public Match getMatch() {
        return match;
    }

    public void setMatch(Match match) {
        this.match = match;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Notification> getNotifications() {
        return notifications;
    }

    public void setNotifications(Set<Notification> notifications) {
        this.notifications = notifications;
    }
}