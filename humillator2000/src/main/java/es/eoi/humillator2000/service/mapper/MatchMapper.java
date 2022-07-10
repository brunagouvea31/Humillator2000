package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.web.dto.ClubDTO;
import es.eoi.humillator2000.web.dto.MatchDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring") //Revisar necesita uses?
public interface MatchMapper extends EntityMapper<MatchDTO, Match> {
}
