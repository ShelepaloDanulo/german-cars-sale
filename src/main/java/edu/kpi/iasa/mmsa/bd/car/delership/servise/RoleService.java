package edu.kpi.iasa.mmsa.bd.car.delership.servise;

import edu.kpi.iasa.mmsa.bd.car.delership.exepcions.CarNotFoundExcepcion;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Role;
import edu.kpi.iasa.mmsa.bd.car.delership.repository.RoleRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    private final RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public List<Role> getRole(){
        return roleRepository.findAll();
    }

    public Role getRoleById(Long id){
        Optional<Role> role = roleRepository.findById(id);
        if(role.isPresent()){
            return role.get();
        }
        throw new CarNotFoundExcepcion();
    }
}
