package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.dto.SeasonDTO;
import es.eoi.humillator2000.data.entity.Season;
import es.eoi.humillator2000.service.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class SeasonServiceMapper extends AbstractServiceMapper<Season, SeasonDTO> {

    private final MatchServiceMapper matchServiceMapper;

    @Autowired
    public SeasonServiceMapper(MatchServiceMapper matchServiceMapper){
        this.matchServiceMapper = matchServiceMapper;
    }


    @Override
    public Season toEntity(SeasonDTO dto) {
        final Season entity = new Season();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        entity.setStartingDate(DateUtil.stringToDate(dto.getStartingDate()));
        entity.setEndingDate(DateUtil.stringToDate(dto.getEndingDate()));
        entity.setMatches(this.matchServiceMapper.toEntity(dto.getMatches().stream().collect(Collectors.toList())).stream().collect(Collectors.toSet()));
        return entity;
    }

    @Override
    public SeasonDTO toDto(Season entity) {
        final SeasonDTO dto = new SeasonDTO();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        dto.setStartingDate(DateUtil.dateToString(entity.getStartingDate()));
        dto.setEndingDate(DateUtil.dateToString(entity.getEndingDate()));
        dto.setMatches(this.matchServiceMapper.toDto(entity.getMatches().stream().collect(Collectors.toList())).stream().collect(Collectors.toSet()));
        return dto;
    }
}
