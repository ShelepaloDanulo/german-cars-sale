package edu.kpi.iasa.mmsa.bd.car.delership.controler;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Users;
import edu.kpi.iasa.mmsa.bd.car.delership.servise.UsersService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class UserController {

    private final UsersService usersService;

    public UserController(UsersService usersService){
        this.usersService = usersService;
    }

    @GetMapping(value = "/users")
    public ResponseEntity<List<Users>> getUser(){
        return ResponseEntity.ok(usersService.getUsers());
    }

    @PostMapping(value = "/users")
    public ResponseEntity<Users> postUser(@RequestBody Users newUser){
        return ResponseEntity.ok(usersService.saveUser(newUser));
    }

    @GetMapping(value = "/users/id=/{id}")
    public ResponseEntity<Users> getUser(@PathVariable Long id){
        return ResponseEntity.ok(usersService.getUsersById(id));
    }

    @GetMapping(value = "/users/{firstName}")
    public ResponseEntity<Users> getUserByName(@PathVariable String firstName){
        return ResponseEntity.ok(usersService.getUserByFirstName(firstName));
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<Users> updateUser(@PathVariable Long id, @Valid @RequestBody Users updatedUser){
        return ResponseEntity.ok(usersService.updateUsersById(id, updatedUser));
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id){
        return ResponseEntity.ok(usersService.deleteUsersById(id));
    }
}
