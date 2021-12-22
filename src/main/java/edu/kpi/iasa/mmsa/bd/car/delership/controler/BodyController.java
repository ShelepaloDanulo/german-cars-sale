package edu.kpi.iasa.mmsa.bd.car.delership.controler;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Body;
import edu.kpi.iasa.mmsa.bd.car.delership.servise.BodyService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class BodyController {
    private final BodyService bodyService;

    public BodyController(BodyService bodyService){
        this.bodyService = bodyService;
    }

    @GetMapping(value = "/body")
    public ResponseEntity<List<Body>> getBody(){
        return ResponseEntity.ok(bodyService.getBody());
    }

    @GetMapping(value = "/body/{id}")
    public ResponseEntity<Body> getBody(@PathVariable Long id){
        return ResponseEntity.ok(bodyService.getBodyById(id));
    }
}
