package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.Club;
import es.eoi.humillator2000.data.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {
    private final ClubRepository clubRepository;

    @Autowired
    public ClubService(ClubRepository clubRepository) {
        this.clubRepository = clubRepository;
    }

    public List<Club> findAll(){
        return clubRepository.findAll();
    }

    public Club findById(Integer id){
        return clubRepository.findById(id).orElseThrow(() -> new RuntimeException("El identificador para club no existe"));
    }
}
