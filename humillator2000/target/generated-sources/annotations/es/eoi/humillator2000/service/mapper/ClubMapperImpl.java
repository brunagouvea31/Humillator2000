package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.web.dto.ClubDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-26T16:23:02+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.3 (Oracle Corporation)"
)
@Component
public class ClubMapperImpl implements ClubMapper {

    @Override
    public Club toEntity(ClubDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Club club = new Club();

        club.setId( dto.getId() );
        club.setName( dto.getName() );

        return club;
    }

    @Override
    public ClubDTO toDto(Club entity) {
        if ( entity == null ) {
            return null;
        }

        ClubDTO clubDTO = new ClubDTO();

        clubDTO.setId( entity.getId() );
        clubDTO.setName( entity.getName() );

        return clubDTO;
    }

    @Override
    public List<Club> toEntity(List<ClubDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Club> list = new ArrayList<Club>( dtoList.size() );
        for ( ClubDTO clubDTO : dtoList ) {
            list.add( toEntity( clubDTO ) );
        }

        return list;
    }

    @Override
    public List<ClubDTO> toDto(List<Club> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ClubDTO> list = new ArrayList<ClubDTO>( entityList.size() );
        for ( Club club : entityList ) {
            list.add( toDto( club ) );
        }

        return list;
    }
}
