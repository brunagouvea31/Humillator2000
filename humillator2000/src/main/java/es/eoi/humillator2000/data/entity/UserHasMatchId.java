package es.eoi.humillator2000.data.entity;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
public class UserHasMatchId implements Serializable {
    private static final long serialVersionUID = 2742452792947774020L;
    private Integer userId;
    private Integer matchId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }
}