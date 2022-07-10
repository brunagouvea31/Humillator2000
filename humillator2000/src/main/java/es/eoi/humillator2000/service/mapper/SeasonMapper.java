package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Season;
import es.eoi.humillator2000.web.dto.ClubDTO;
import es.eoi.humillator2000.web.dto.SeasonDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface SeasonMapper extends EntityMapper<SeasonDTO, Season> {
}
