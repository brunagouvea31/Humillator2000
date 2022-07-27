package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Role;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.web.dto.RoleDTO;
import es.eoi.humillator2000.web.dto.UserDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-07-26T16:23:02+0200",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.3 (Oracle Corporation)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User user = new User();

        user.setId( dto.getId() );
        user.setLogin( dto.getLogin() );
        byte[] avatar = dto.getAvatar();
        if ( avatar != null ) {
            user.setAvatar( Arrays.copyOf( avatar, avatar.length ) );
        }
        user.setEmail( dto.getEmail() );
        user.setRoles( roleDTOSetToRoleSet( dto.getRoles() ) );

        return user;
    }

    @Override
    public UserDTO toDto(User entity) {
        if ( entity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setId( entity.getId() );
        userDTO.setLogin( entity.getLogin() );
        byte[] avatar = entity.getAvatar();
        if ( avatar != null ) {
            userDTO.setAvatar( Arrays.copyOf( avatar, avatar.length ) );
        }
        userDTO.setEmail( entity.getEmail() );
        userDTO.setRoles( roleSetToRoleDTOSet( entity.getRoles() ) );

        return userDTO;
    }

    @Override
    public List<User> toEntity(List<UserDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dtoList.size() );
        for ( UserDTO userDTO : dtoList ) {
            list.add( toEntity( userDTO ) );
        }

        return list;
    }

    @Override
    public List<UserDTO> toDto(List<User> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( entityList.size() );
        for ( User user : entityList ) {
            list.add( toDto( user ) );
        }

        return list;
    }

    protected Set<Role> roleDTOSetToRoleSet(Set<RoleDTO> set) {
        if ( set == null ) {
            return null;
        }

        Set<Role> set1 = new LinkedHashSet<Role>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( RoleDTO roleDTO : set ) {
            set1.add( roleMapper.toEntity( roleDTO ) );
        }

        return set1;
    }

    protected Set<RoleDTO> roleSetToRoleDTOSet(Set<Role> set) {
        if ( set == null ) {
            return null;
        }

        Set<RoleDTO> set1 = new LinkedHashSet<RoleDTO>( Math.max( (int) ( set.size() / .75f ) + 1, 16 ) );
        for ( Role role : set ) {
            set1.add( roleMapper.toDto( role ) );
        }

        return set1;
    }
}
