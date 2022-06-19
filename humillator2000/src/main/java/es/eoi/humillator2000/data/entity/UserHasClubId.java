package es.eoi.humillator2000.data.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserHasClubId implements Serializable {
    private static final long serialVersionUID = 2742452792947774020L;
    private Integer userId;
    private Integer clubId;
    private Integer roleId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClubId() {
        return clubId;
    }

    public void setClubId(Integer clubId) {
        this.clubId = clubId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserHasClubId)) return false;
        UserHasClubId that = (UserHasClubId) o;
        return Objects.equals(getUserId(), that.getUserId()) && Objects.equals(getClubId(), that.getClubId()) && Objects.equals(getRoleId(), that.getRoleId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUserId(), getClubId(), getRoleId());
    }
}
