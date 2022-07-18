package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Notification;
import es.eoi.humillator2000.data.repository.NotificationRepository;
import es.eoi.humillator2000.service.mapper.NotificationMapper;
import es.eoi.humillator2000.web.dto.NotificationDTO;
import org.springframework.stereotype.Service;

@Service
public class NotificationService extends AbstractService<Integer, Notification, NotificationRepository, NotificationDTO, NotificationMapper>{

    private final NotificationRepository notificationRepository;


    public NotificationService(NotificationRepository repository, NotificationMapper mapper, NotificationRepository notificationRepository) {
        super(repository, mapper);
        this.notificationRepository = notificationRepository;
    }
}
