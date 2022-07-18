package es.eoi.humillator2000.web.controller;



import es.eoi.humillator2000.data.entity.Notification;

import es.eoi.humillator2000.service.NotificationService;
import es.eoi.humillator2000.web.dto.NotificationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notification")
public class NotificationRestController {
    final private NotificationService notificationService;

    public NotificationRestController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping
    public Page<NotificationDTO> findAll(Pageable pageable){
        return notificationService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public NotificationDTO findById(@PathVariable("id") Integer id){
        return  notificationService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id")Integer id){
        notificationService.deleteById(id);
    }

    @PostMapping
    public NotificationDTO save(NotificationDTO notificationDTO){
        return notificationService.save(notificationDTO);
    }
}
