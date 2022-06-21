package es.eoi.humillator2000.data.repository;

import es.eoi.humillator2000.data.entity.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;

public interface MatchRepository extends JpaRepository<Match, Integer> {

    Match findByStartingDateAndEndingDate(LocalDateTime startingDate, LocalDateTime endingDate);
}
