package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Notification;
import es.eoi.humillator2000.data.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService extends AbstractService<Integer, Notification, NotificationRepository>{

    private final NotificationRepository notificationRepository;

    @Autowired
    public NotificationService(NotificationRepository repository, NotificationRepository notificationRepository) {
        super(repository);
        this.notificationRepository = notificationRepository;
    }

    public void addNotification (Integer id){

        final Notification notification= this.notificationRepository.findById(id).orElseThrow(()-> new RuntimeException(".........."));


    }



}
