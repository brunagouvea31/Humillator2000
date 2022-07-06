package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.UserHasClub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserHasClubRepository extends JpaRepository<UserHasClub, Integer> {

    Optional<UserHasClub> findByClubId(Integer integer);
}
