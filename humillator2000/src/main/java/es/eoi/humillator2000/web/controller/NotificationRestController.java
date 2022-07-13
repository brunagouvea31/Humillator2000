package es.eoi.humillator2000.web.controller;


import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.entity.Notification;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.NotificationRepository;
import es.eoi.humillator2000.service.ClubService;
import es.eoi.humillator2000.service.NotificationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationRestController extends AbstractRestController<NotificationService, Notification,Integer, NotificationRepository>{

    protected NotificationRestController(NotificationService service) {
        super(service);
    }
}
