package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.dto.MatchDTO;
import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.service.utils.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceMapper extends AbstractServiceMapper<Match, MatchDTO> {
    private final SeasonServiceMapper seasonServiceMapper;
    private final ClubServiceMapper clubServiceMapper;

    @Autowired
    public MatchServiceMapper(SeasonServiceMapper seasonServiceMapper, ClubServiceMapper clubServiceMapper){
        this.seasonServiceMapper = seasonServiceMapper;
        this.clubServiceMapper = clubServiceMapper;
    }

    @Override
    public Match toEntity(MatchDTO dto) {
        final Match entity = new Match();
        entity.setId(dto.getId());
        entity.setStartingDate(DateUtil.stringToDate(dto.getStartingDate()));
        entity.setEndingDate(DateUtil.stringToDate(dto.getEndingDate()));
        entity.setDescription(dto.getDescription());
        entity.setTitle(dto.getTitle());
        entity.setLocation(dto.getLocation());
        entity.setDelete(dto.getDelete());
        entity.setSeason(dto.getSeason());
        entity.setClub(dto.getClub());
        return entity;
    }

    @Override
    public MatchDTO toDto(Match entity) {
        final MatchDTO dto = new MatchDTO();
        dto.setId(entity.getId());
        dto.setStartingDate(DateUtil.dateToString(entity.getStartingDate()));
        dto.setEndingDate(DateUtil.dateToString(entity.getEndingDate()));
        dto.setDescription(entity.getDescription());
        dto.setTitle(entity.getTitle());
        dto.setLocation(entity.getLocation());
        dto.setDelete(entity.getDelete());
        dto.setSeason(entity.getSeason());
        dto.setClub(entity.getClub());
        return dto;
    }




}
