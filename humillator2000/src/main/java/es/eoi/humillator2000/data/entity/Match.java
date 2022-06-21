package es.eoi.humillator2000.data.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private LocalDateTime startingDate;

    @Column(nullable = false)
    private LocalDateTime endingDate;

    private String description;

    @Column(nullable = false)
    private String title;

    private String location;

    private Double price;

    @Column(nullable = false)
    private Boolean delete;

    @ManyToOne
    private Season season;

    @ManyToOne
    private Club club;

    @OneToMany(mappedBy = "match")
    private Set<UserHasMatch> userHasMatches;

    public Set<UserHasMatch> getUserHasMatches() {
        return userHasMatches;
    }

    public void setUserHasMatches(Set<UserHasMatch> userHasMatches) {
        this.userHasMatches = userHasMatches;
    }

    public Club getUserGroup() {
        return club;
    }

    public void setUserGroup(Club club) {
        this.club = club;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(LocalDateTime startingDate) {
        this.startingDate = startingDate;
    }

    public LocalDateTime getEndingDate() {
        return endingDate;
    }

    public void setEndingDate(LocalDateTime endingDate) {
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
}
