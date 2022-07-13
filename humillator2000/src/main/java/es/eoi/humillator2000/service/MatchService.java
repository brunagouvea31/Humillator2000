package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.data.repository.MatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchService extends AbstractService<Integer, Match, MatchRepository>{

    private final MatchRepository matchRepository;

    @Autowired
    public MatchService(MatchRepository repository, MatchRepository matchRepository) {
        super(repository);
        this.matchRepository = matchRepository;
    }

    public void addMatch (Integer id){
        final Match match= this.matchRepository.findById(id).orElseThrow(()-> new RuntimeException("No existe el partido"));



    }



}
