package edu.kpi.iasa.mmsa.bd.car.delership.controler;

import edu.kpi.iasa.mmsa.bd.car.delership.model.Model;
import edu.kpi.iasa.mmsa.bd.car.delership.servise.ModelService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ModelController {
    private final ModelService modelService;

    public ModelController(ModelService modelService){
        this.modelService = modelService;
    }

    @GetMapping(value = "/model")
    public ResponseEntity<List<Model>> getModel(){
        return ResponseEntity.ok(modelService.getModel());
    }

    @GetMapping(value = "/model/{id}")
    public ResponseEntity<Model> getModel(@PathVariable Long id){
        return ResponseEntity.ok(modelService.getModelById(id));
    }
}
