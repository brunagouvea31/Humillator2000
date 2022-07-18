package es.eoi.humillator2000.service;

import es.eoi.humillator2000.data.entity.*;
import es.eoi.humillator2000.data.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService extends AbstractService<Integer, Club, ClubRepository>{

    private final UserRepository userRepository;
    private final UserHasClubRepository userHasClubRepository;
    private final ClubRoleRepository clubRoleRepository;



    @Autowired
    public ClubService(ClubRepository repository, UserRepository userRepository, UserHasClubRepository userHasClubRepository, ClubRoleRepository clubRoleRepository, RoleRepository roleRepository) {
        super(repository);
        this.userRepository = userRepository;
        this.userHasClubRepository = userHasClubRepository;
        this.clubRoleRepository = clubRoleRepository;

    }

    public List<Club> getClubsByUserId(Integer id){
        return super.getRepository().findByUserHashClubsUserId(id);
    }


    public void addUser(Integer id, Integer userId, Integer roleId){
        final User user = this.userRepository.findById(userId).orElseThrow(()-> new RuntimeException("No existe usuario para el id + ID----------"));
        final Club club = this.getRepository().findById(id).orElseThrow(()-> new RuntimeException("No ID CLUB"));
        final ClubRole clubRole = this.clubRoleRepository.findById(roleId).orElseThrow(()->new RuntimeException("No existe el rol"));


        final UserHasClub userHasClub = new UserHasClub();
        userHasClub.setUser(user);
        userHasClub.setClub(club);
        userHasClub.setClubRole(clubRole);


        this.userHasClubRepository.save(userHasClub);
    }

}
