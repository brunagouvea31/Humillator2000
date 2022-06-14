package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {
}
