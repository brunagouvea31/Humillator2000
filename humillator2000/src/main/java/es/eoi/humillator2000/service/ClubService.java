package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService extends AbstractService<Integer, Club, ClubRepository>{


    @Autowired
    public ClubService(ClubRepository repository) {
        super(repository);
    }

    public List<Club> getClubsByUserId(Integer id){
        return super.getRepository().findByUserHashClubsUserId(id);
    }



}
