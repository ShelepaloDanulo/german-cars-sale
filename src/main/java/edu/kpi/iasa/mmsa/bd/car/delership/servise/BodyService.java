package edu.kpi.iasa.mmsa.bd.car.delership.servise;

import edu.kpi.iasa.mmsa.bd.car.delership.exepcions.CarNotFoundExcepcion;
import edu.kpi.iasa.mmsa.bd.car.delership.model.Body;
import edu.kpi.iasa.mmsa.bd.car.delership.repository.BodyRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BodyService {
    private final BodyRepository bodyRepository;
    public BodyService(BodyRepository bodyRepository){
        this.bodyRepository = bodyRepository;
    }

    public List<Body> getBody(){
        return bodyRepository.findAll();
    }

    public Body getBodyById(Long id) {
        Optional<Body> body = bodyRepository.findById(id);
        if(body.isPresent()){
            return body.get();
        }
        throw new CarNotFoundExcepcion();
    }
}
