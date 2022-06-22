package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Notification;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService extends AbstractService<Integer, Notification, NotificationRepository>{

    @Autowired
    public NotificationService(NotificationRepository repository) {
        super(repository);
    }

}
