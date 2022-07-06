package es.eoi.humillator2000.data.dto;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.ClubRole;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.entity.UserHasClubId;

public class UserHasClubDTO {
    private UserHasClubId id;
    private Float rating;
    private Club club;
    private User user;
    private ClubRole clubRole;
}
