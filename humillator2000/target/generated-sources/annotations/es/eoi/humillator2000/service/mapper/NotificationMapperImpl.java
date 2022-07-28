package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Notification;
import es.eoi.humillator2000.web.dto.NotificationDTO;
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
public class NotificationMapperImpl implements NotificationMapper {

    @Override
    public Notification toEntity(NotificationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Notification notification = new Notification();

        notification.setId( dto.getId() );
        notification.setMinutes( dto.getMinutes() );
        notification.setIsNotified( dto.getIsNotified() );

        return notification;
    }

    @Override
    public NotificationDTO toDto(Notification entity) {
        if ( entity == null ) {
            return null;
        }

        NotificationDTO notificationDTO = new NotificationDTO();

        notificationDTO.setId( entity.getId() );
        notificationDTO.setMinutes( entity.getMinutes() );
        notificationDTO.setIsNotified( entity.getIsNotified() );

        return notificationDTO;
    }

    @Override
    public List<Notification> toEntity(List<NotificationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Notification> list = new ArrayList<Notification>( dtoList.size() );
        for ( NotificationDTO notificationDTO : dtoList ) {
            list.add( toEntity( notificationDTO ) );
        }

        return list;
    }

    @Override
    public List<NotificationDTO> toDto(List<Notification> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<NotificationDTO> list = new ArrayList<NotificationDTO>( entityList.size() );
        for ( Notification notification : entityList ) {
            list.add( toDto( notification ) );
        }

        return list;
    }
}
