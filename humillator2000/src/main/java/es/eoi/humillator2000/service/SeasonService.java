package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Season;
import es.eoi.humillator2000.data.repository.SeasonRepository;

import es.eoi.humillator2000.web.dto.SeasonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeasonService extends AbstractService<Integer, Season, SeasonRepository, SeasonDTO, SeasonMapper> {

    public SeasonService(SeasonRepository repository, SeasonMapper mapper) {
        super(repository, mapper);
    }
}
