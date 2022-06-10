package es.eoi.humillator2000.data.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_has_match")
public class UserHasMatch {
    @EmbeddedId
    private UserHasMatchId id;

    private Boolean isOwner;
    private Integer mark;

    @ManyToOne
    @JoinColumn(name = "match_ID")
    @MapsId("matchId")
    private Match match;

    @ManyToOne
    @JoinColumn(name = "user_ID")
    @MapsId("userId")
    private User user;

    public UserHasMatchId getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}