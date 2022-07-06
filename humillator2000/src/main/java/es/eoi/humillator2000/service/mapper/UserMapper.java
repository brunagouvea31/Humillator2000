package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.web.dto.UserDTO;
import es.eoi.humillator2000.data.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper extends EntityMapper<UserDTO, User> {

}
