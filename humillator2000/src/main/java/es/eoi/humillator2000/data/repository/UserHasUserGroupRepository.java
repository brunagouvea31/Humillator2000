package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.UserHasUserGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHasUserGroupRepository extends JpaRepository<UserHasUserGroup, Integer> {
}
