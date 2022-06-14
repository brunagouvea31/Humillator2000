package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.UserHasMatchId;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserHasMatchIdRepository extends JpaRepository<UserHasMatchId, Integer> {
}
