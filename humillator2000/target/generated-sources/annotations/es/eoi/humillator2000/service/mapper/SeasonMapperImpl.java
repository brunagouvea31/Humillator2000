package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Season;
import es.eoi.humillator2000.web.dto.SeasonDTO;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-13T11:46:58+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 18.0.1 (Oracle Corporation)"
)
@Component
public class SeasonMapperImpl implements SeasonMapper {

    @Override
    public Season toEntity(SeasonDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Season season = new Season();

        season.setId( dto.getId() );
        season.setName( dto.getName() );
        if ( dto.getStartingDate() != null ) {
            season.setStartingDate( LocalDateTime.parse( dto.getStartingDate() ) );
        }
        if ( dto.getEndingDate() != null ) {
            season.setEndingDate( LocalDateTime.parse( dto.getEndingDate() ) );
        }

        return season;
    }

    @Override
    public SeasonDTO toDto(Season entity) {
        if ( entity == null ) {
            return null;
        }

        SeasonDTO seasonDTO = new SeasonDTO();

        seasonDTO.setId( entity.getId() );
        seasonDTO.setName( entity.getName() );
        if ( entity.getStartingDate() != null ) {
            seasonDTO.setStartingDate( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( entity.getStartingDate() ) );
        }
        if ( entity.getEndingDate() != null ) {
            seasonDTO.setEndingDate( DateTimeFormatter.ISO_LOCAL_DATE_TIME.format( entity.getEndingDate() ) );
        }

        return seasonDTO;
    }

    @Override
    public List<Season> toEntity(List<SeasonDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Season> list = new ArrayList<Season>( dtoList.size() );
        for ( SeasonDTO seasonDTO : dtoList ) {
            list.add( toEntity( seasonDTO ) );
        }

        return list;
    }

    @Override
    public List<SeasonDTO> toDto(List<Season> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SeasonDTO> list = new ArrayList<SeasonDTO>( entityList.size() );
        for ( Season season : entityList ) {
            list.add( toDto( season ) );
        }

        return list;
    }
}
