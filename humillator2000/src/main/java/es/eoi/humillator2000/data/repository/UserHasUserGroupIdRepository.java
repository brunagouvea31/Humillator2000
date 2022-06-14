package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.UserHasUserGroupId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHasUserGroupIdRepository extends JpaRepository<UserHasUserGroupId, Integer> {
}
