package edu.kpi.iasa.mmsa.bd.car.delership.controler;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Role;
import edu.kpi.iasa.mmsa.bd.car.delership.servise.RoleService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class RoleController {
    private final RoleService roleService;

    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @GetMapping(value = "/role")
    public ResponseEntity<List<Role>> getRole(){
        return ResponseEntity.ok(roleService.getRole());
    }

    @GetMapping(value = "/role/{id}")
    public ResponseEntity<Role> getRole(@PathVariable Long id){
        return ResponseEntity.ok(roleService.getRoleById(id));
    }
}
