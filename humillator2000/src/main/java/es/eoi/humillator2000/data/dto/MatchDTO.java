package es.eoi.humillator2000.data.dto;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Season;
import es.eoi.humillator2000.data.entity.UserHasMatch;
import java.time.LocalDateTime;
import java.util.Set;

// CUANDO SERIALIZABLE ??
public class MatchDTO {
    private Integer id;

    // LO RECIBE EN STRING DE BBDD SE CONVIERTE A FORMATO EN MAPPER
    private String startingDate;
    private String endingDate;
    private String description;
    private String title;
    private String location;
    private Double price;
    private Boolean delete;
    private Season season;
    private Club club;

    // SE DEJA TAL CUAL ??
    private Set<UserHasMatch> userHasMatches;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(String startingDate) {
        this.startingDate = startingDate;
    }

    public String getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(String endingDate) {
        this.endingDate = endingDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public Set<UserHasMatch> getUserHasMatches() {
        return userHasMatches;
    }

    public void setUserHasMatches(Set<UserHasMatch> userHasMatches) {
        this.userHasMatches = userHasMatches;
    }
}
