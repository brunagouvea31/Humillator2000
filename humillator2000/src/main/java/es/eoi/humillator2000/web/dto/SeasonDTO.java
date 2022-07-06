package es.eoi.humillator2000.web.dto;

import es.eoi.humillator2000.data.entity.Match;


import java.util.List;
import java.util.Set;

public class SeasonDTO {
    private Integer id;
    private String name;

    private String startingDate;
    private String endingDate;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
