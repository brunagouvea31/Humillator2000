package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.web.dto.ClubDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClubMapper extends EntityMapper<ClubDTO, Club> {
}
