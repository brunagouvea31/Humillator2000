package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.ClubRole;
import es.eoi.humillator2000.web.dto.ClubRoleDTO;
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
public class ClubRoleMapperImpl implements ClubRoleMapper {

    @Override
    public ClubRole toEntity(ClubRoleDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ClubRole clubRole = new ClubRole();

        clubRole.setId( dto.getId() );
        clubRole.setName( dto.getName() );

        return clubRole;
    }

    @Override
    public ClubRoleDTO toDto(ClubRole entity) {
        if ( entity == null ) {
            return null;
        }

        ClubRoleDTO clubRoleDTO = new ClubRoleDTO();

        clubRoleDTO.setId( entity.getId() );
        clubRoleDTO.setName( entity.getName() );

        return clubRoleDTO;
    }

    @Override
    public List<ClubRole> toEntity(List<ClubRoleDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ClubRole> list = new ArrayList<ClubRole>( dtoList.size() );
        for ( ClubRoleDTO clubRoleDTO : dtoList ) {
            list.add( toEntity( clubRoleDTO ) );
        }

        return list;
    }

    @Override
    public List<ClubRoleDTO> toDto(List<ClubRole> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ClubRoleDTO> list = new ArrayList<ClubRoleDTO>( entityList.size() );
        for ( ClubRole clubRole : entityList ) {
            list.add( toDto( clubRole ) );
        }

        return list;
    }
}
