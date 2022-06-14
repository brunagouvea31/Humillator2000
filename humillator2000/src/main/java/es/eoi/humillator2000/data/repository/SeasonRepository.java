package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Integer> {
}
