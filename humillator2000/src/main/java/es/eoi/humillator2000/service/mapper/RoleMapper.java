package es.eoi.humillator2000.service.mapper;


import es.eoi.humillator2000.web.dto.RoleDTO;
import es.eoi.humillator2000.data.entity.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RoleMapper extends EntityMapper<RoleDTO, Role>{

}
