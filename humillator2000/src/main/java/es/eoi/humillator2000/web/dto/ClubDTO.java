package es.eoi.humillator2000.web.dto;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.service.mapper.EntityMapper;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.Set;
@Getter
@Setter
public class ClubDTO {
    private Integer id;
    private String name;


}
