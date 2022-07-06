package es.eoi.humillator2000.web.dto;

import es.eoi.humillator2000.data.entity.UserHasMatch;

public class NotificationDTO {
    private Integer id;
    private Integer minutes;
    private Boolean isNotifyed;

    // ENTERO CON USERID y MATCHID
    private UserHasMatch userHasMatch;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Boolean getNotifyed() {
        return isNotifyed;
    }

    public void setNotifyed(Boolean notifyed) {
        isNotifyed = notifyed;
    }

    public UserHasMatch getUserHasMatch() {
        return userHasMatch;
    }

    public void setUserHasMatch(UserHasMatch userHasMatch) {
        this.userHasMatch = userHasMatch;
    }
}
