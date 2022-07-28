package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.web.dto.MatchDTO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-28T18:21:41+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1 (Oracle Corporation)"
)
@Component
public class MatchMapperImpl implements MatchMapper {

    @Override
    public Match toEntity(MatchDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Match match = new Match();

        match.setId( dto.getId() );
        if ( dto.getStartingDate() != null ) {
            match.setStartingDate( LocalDateTime.parse( dto.getStartingDate() ) );
        }
        if ( dto.getEndingDate() != null ) {
            match.setEndingDate( LocalDateTime.parse( dto.getEndingDate() ) );
        }
        match.setDescription( dto.getDescription() );
        match.setTitle( dto.getTitle() );
        match.setLocation( dto.getLocation() );
        match.setPrice( dto.getPrice() );
        match.setDelete( dto.getDelete() );

        return match;
    }

    @Override
    public MatchDTO toDto(Match entity) {
        if ( entity == null ) {
            return null;
        }

        MatchDTO matchDTO = new MatchDTO();

        matchDTO.setId( entity.getId() );
        if ( entity.getStartingDate() != null ) {
            matchDTO.setStartingDate( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( entity.getStartingDate() ) );
        }
        if ( entity.getEndingDate() != null ) {
            matchDTO.setEndingDate( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( entity.getEndingDate() ) );
        }
        matchDTO.setDescription( entity.getDescription() );
        matchDTO.setTitle( entity.getTitle() );
        matchDTO.setLocation( entity.getLocation() );
        matchDTO.setPrice( entity.getPrice() );
        matchDTO.setDelete( entity.getDelete() );

        return matchDTO;
    }

    @Override
    public List<Match> toEntity(List<MatchDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Match> list = new ArrayList<Match>( dtoList.size() );
        for ( MatchDTO matchDTO : dtoList ) {
            list.add( toEntity( matchDTO ) );
        }

        return list;
    }

    @Override
    public List<MatchDTO> toDto(List<Match> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<MatchDTO> list = new ArrayList<MatchDTO>( entityList.size() );
        for ( Match match : entityList ) {
            list.add( toDto( match ) );
        }

        return list;
    }
}
