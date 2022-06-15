package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRoleRepository extends JpaRepository<UserRole, Integer> {
}
