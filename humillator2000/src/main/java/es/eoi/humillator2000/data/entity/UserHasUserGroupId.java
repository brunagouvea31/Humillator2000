package es.eoi.humillator2000.data.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UserHasUserGroupId implements Serializable {
    private static final long serialVersionUID = 2742452792947774020L;
    private Integer userId;
    private Integer userGroupId;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }
}
