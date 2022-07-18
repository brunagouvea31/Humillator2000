package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Match;
import es.eoi.humillator2000.data.entity.User;
import es.eoi.humillator2000.data.entity.UserHasMatch;
import es.eoi.humillator2000.data.repository.ClubRepository;
import es.eoi.humillator2000.data.repository.MatchRepository;
import es.eoi.humillator2000.data.repository.UserHasMatchRepository;
import es.eoi.humillator2000.data.repository.UserRepository;
import es.eoi.humillator2000.service.mapper.MatchMapper;
import es.eoi.humillator2000.web.dto.MatchDTO;
import org.springframework.stereotype.Service;

@Service
public class MatchService extends AbstractService<Integer, Match, MatchRepository, MatchDTO, MatchMapper>{

    private final MatchRepository matchRepository;
    private final UserRepository userRepository;
    private final UserHasMatchRepository userHasMatchRepository;

    public MatchService(MatchRepository repository, MatchMapper mapper, MatchRepository matchRepository, UserRepository userRepository, ClubRepository clubRepository, UserHasMatchRepository userHasMatchRepository) {
        super(repository, mapper);
        this.matchRepository = matchRepository;
        this.userRepository = userRepository;
        this.userHasMatchRepository = userHasMatchRepository;

    }


    public UserHasMatch addUser (Integer id){
        final Match match= this.matchRepository.findById(id).orElseThrow(()-> new RuntimeException("No existe el partido"));
        final User user= this.userRepository.findById(id).orElseThrow(()-> new RuntimeException("No existe el usuario"));

        final UserHasMatch userHasMatch = new UserHasMatch();
        userHasMatch.setMatch(match);
        userHasMatch.setUser(user);

        return this.userHasMatchRepository.save(userHasMatch);

    }



}
