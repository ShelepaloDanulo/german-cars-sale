package edu.kpi.iasa.mmsa.bd.car.delership.servise;

import edu.kpi.iasa.mmsa.bd.car.delership.exepcions.CarNotFoundExcepcion;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Model;
import edu.kpi.iasa.mmsa.bd.car.delership.repository.ModelRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.List;

@Service
public class ModelService {
    private final ModelRepository modelRepository;
    public ModelService(ModelRepository modelRepository){
        this.modelRepository = modelRepository;
    }

    public List<Model> getModel(){
        return modelRepository.findAll();
    }

    public Model getModelById(Long id) {
        Optional<Model> model = modelRepository.findById(id);
        if(model.isPresent()){
            return model.get();
        }
        throw new CarNotFoundExcepcion();
    }
}