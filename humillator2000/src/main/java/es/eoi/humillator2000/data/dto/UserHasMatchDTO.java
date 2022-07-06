package es.eoi.humillator2000.data.dto;

import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.data.entity.Notification;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.entity.UserHasMatchId;

import java.util.Set;

public class UserHasMatchDTO {
    private UserHasMatchId id;
    private Boolean isOwner;
    private Integer mark;
    private Match match;
    private User user;
    private Set<Notification> notifications;
}
