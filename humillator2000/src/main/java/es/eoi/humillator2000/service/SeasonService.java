package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Season;
import es.eoi.humillator2000.data.repository.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonService extends AbstractService<Integer, Season, SeasonRepository> {

    @Autowired
    public SeasonService(SeasonService repository) {
        super((SeasonRepository) repository);
    }
}
