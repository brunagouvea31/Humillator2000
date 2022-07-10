package es.eoi.humillator2000.service.mapper;


import es.eoi.humillator2000.data.entity.ClubRole;
import es.eoi.humillator2000.web.dto.ClubRoleDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClubRoleMapper extends EntityMapper<ClubRoleDTO, ClubRole> {
}
