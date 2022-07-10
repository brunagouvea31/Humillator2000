package es.eoi.humillator2000.service.mapper;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Notification;
import es.eoi.humillator2000.web.dto.ClubDTO;
import es.eoi.humillator2000.web.dto.NotificationDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NotificationMapper extends EntityMapper<NotificationDTO, Notification> {
}
