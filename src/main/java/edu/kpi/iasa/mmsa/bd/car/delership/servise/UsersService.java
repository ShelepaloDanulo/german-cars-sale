package edu.kpi.iasa.mmsa.bd.car.delership.servise;

import edu.kpi.iasa.mmsa.bd.car.delership.exepcions.CarNotFoundExcepcion;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Users;
import edu.kpi.iasa.mmsa.bd.car.delership.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersService {
    private final UsersRepository usersRepository;
    public UsersService(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

    public Users saveUser(Users newUser){
        return usersRepository.save(newUser);
    }

    public Users getUsersById(Long id){
        Optional<Users> users = usersRepository.findById(id);
        if(users.isPresent()){
            return users.get();
        }
        throw new CarNotFoundExcepcion();
    }

    public Users getUserByFirstName(String firstName) {
        return usersRepository.findByFirstName(firstName);
    }

    public Users updateUsersById(Long id, Users updatedUser) {
        Optional<Users> users = usersRepository.findById(id);
        if(users.isPresent()){
            Users oldUser = users.get();
            updateUsers(oldUser, updatedUser);
            return usersRepository.save(oldUser);
        }
        throw new CarNotFoundExcepcion();
    }

    private void updateUsers(Users oldUser, Users updatedUser) {
        oldUser.setFirstName(updatedUser.getFirstName());
        oldUser.setLastName(updatedUser.getLastName());
        oldUser.setEmail(updatedUser.getEmail());
        oldUser.setLogin(updatedUser.getLogin());
        oldUser.setPhone(updatedUser.getPhone());
        oldUser.setRating(updatedUser.getRating());
    }

    public String deleteUsersById(Long id) {
        usersRepository.deleteById(id);
        return "User was successfully deleted!";
    }
}
