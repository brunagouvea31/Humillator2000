package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.UserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserGroupRepository extends JpaRepository<UserGroup, Integer> {
}
